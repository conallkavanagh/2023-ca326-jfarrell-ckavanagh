import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class placeholderDisplayVisitor extends placeholderBaseVisitor<Object>{

    Map<String, Object> memory = new HashMap<String, Object>();

    @Override
    public Object visitAssignstmt(placeholderParser.AssignstmtContext ctx) {
        String id = ctx.ID().getText();          // id is left-hand side of '='
        Object value = visit(ctx.expression());  // compute value of expression on right
        memory.put(id, value);                   // store it in our memory
        // System.out.format("%s = %s\n", id, value);
        // System.out.println(value.getClass());
        return value;
    }

	@Override 
    public Object visitList(placeholderParser.ListContext ctx) { 
        ArrayList<Object> list = new ArrayList<Object>();
        for (placeholderParser.TermContext term : ctx.term()) {
            list.add(visit(term));
        }
        return list;
    }

    /** Terms */
    @Override
    public Object visitTerms(placeholderParser.TermsContext ctx) {
        return visit(ctx.term());
    }

    /** Number */
    @Override
    public Object visitNumber(placeholderParser.NumberContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    private String stringify(Object object) {
        if (object == null) return "nil";

        if (object instanceof Double) {
            String text = object.toString();
            if (text.endsWith(".0")) {
                text = text.substring(0, text.length() - 2);
            }
            return text;
        }

        return object.toString();
    }

    /** ID */
    @Override
    public Object visitId(placeholderParser.IdContext ctx) {
        String id = ctx.getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return null;
    }

    @Override
    public Object visitString(placeholderParser.StringContext ctx) {
        String text = ctx.getText();
        int length = text.length();
        return text.substring(1, length-1);
    }

    @Override
    public Object visitBool(placeholderParser.BoolContext ctx) {
        return Boolean.valueOf(ctx.getText());
    }

    @Override
    public Object visitExponent(placeholderParser.ExponentContext ctx) {
        double base     = (double) visit(ctx.expression(0));
        double exponent = (double) visit(ctx.expression(1));
        return Math.pow(base, exponent);
    }

    @Override 
    public Object visitPlusMinus(placeholderParser.PlusMinusContext ctx) {
        Object left  = visit(ctx.expression(0));
        Object right = visit(ctx.expression(1));

        if(ctx.op.getType() == placeholderParser.PLUS){
            if (left instanceof Double && right instanceof Double) {
                // normal addition
                return (double)left + (double)right;

            } else if (left instanceof String && right instanceof String) {
                // string concatenation
                return (String)left + (String)right;

            } else if (left instanceof Double && right instanceof String) {
                // string concatenation
                return (double)left + (String)right;

            } else if (left instanceof String && right instanceof Double) {
                // string concatenation
                return (String)left + (double)right;

            } else if (left instanceof ArrayList && right instanceof String) {
                // string concatenation
                return (ArrayList)left + (String)right;

            } else if (left instanceof ArrayList) {
                // append to arrays
                ArrayList<Object> list = (ArrayList<Object>)left;
                list.add(right);
                return list;
            }
        } 
        if (left instanceof ArrayList) {
            ArrayList<Object> list = (ArrayList<Object>)left;
                list.remove(right);
                return list;
        }
        // must be MINUS
        return (double)left - (double)right;
    }
    
	@Override
    public Object visitIfstmt(placeholderParser.IfstmtContext ctx) {
        System.out.println("visiting if statements");
        // System.out.println(ctx.expression());
        System.out.println(ctx);
        // System.out.println(ctx.stm(0).getText());
        int i = 0;
        for (placeholderParser.ExpressionContext var : ctx.expression()) {
            // we are going through each boolean expression of the if and else if statements
            if ((boolean)visit(var)) {
                System.out.println("evaluated to True");
                return visit(ctx.block(i));
            } else {
                System.out.println("evaluated to False");
            }
            i++;
        }
        // we have gone through the if and all else ifs now
        try {
            // try and see if there is an else block
            return visit(ctx.block(i));
        } catch (Exception e) {
            // if not just return null
            return null;
        }
    }

    @Override 
    public Object visitMultDiv(placeholderParser.MultDivContext ctx) {
        double left  = (double) visit(ctx.expression(0));
        double right = (double) visit(ctx.expression(1));
        Double d;
        if(ctx.op.getType() == placeholderParser.MULT){
            d = left * right;
        } else {
            d = left / right; //must be DIV
        }
        return d;
    }
    
    @Override 
    public Object visitMinus(placeholderParser.MinusContext ctx) {
        return -1 * (double) visit(ctx.expression());
    }
    
    @Override 
    public Object visitSay(placeholderParser.SayContext ctx) {
        // int length = ctx.STRING().getText().length();
        // System.out.println(ctx.STRING().getText().substring(1, length-1));
        System.out.println(stringify(visit(ctx.term())));
        return null;
    }
    
    @Override 
    public Object visitLoop(placeholderParser.LoopContext ctx) {
        double x;
        // check if its an id or number
        if (ctx.ID() != null) {
            /* we have to do this as for some reason it doesnt 
               seem to visit our visitId method when attempted */
            x = (double) memory.get(ctx.ID().getText());
        } else {
            x = Double.valueOf(ctx.NUMBER().getText());
        }
        for (double i = 0; i < x; i++) {
            for (placeholderParser.StmContext stat : ctx.stm()) {
                this.visit(stat);
            }
        }
        return null;
    }

	@Override public Object visitParens(placeholderParser.ParensContext ctx) {
        return visit(ctx.expression());
    }
}
