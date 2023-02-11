import java.util.HashMap;
import java.util.Map;

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

    /** ID */
    @Override
    public Object visitId(placeholderParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return null;
    }

    @Override
    public Object visitString(placeholderParser.StringContext ctx) {
        return ctx.getText();
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
        // String ans = String.valueOf(d);
    }

    @Override 
    public Object visitPlusMinus(placeholderParser.PlusMinusContext ctx) {
        double left  = (double) visit(ctx.expression(0));
        double right = (double) visit(ctx.expression(1));
        Double d;
        if(ctx.op.getType() == placeholderParser.PLUS){
            d = left + right;
        } else {
            d = left - right; //must be MINUS
        }
        return d;
    }
    
    @Override 
    public Object visitMultDiv(placeholderParser.MultDivContext ctx) {
        double left  = (double) visit(ctx.expression(0));
        double right = (double) visit(ctx.expression(0));
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
        double d =  -1 * (double) visit(ctx.expression());
        return d;
    }
    
    @Override 
    public Object visitSay(placeholderParser.SayContext ctx) {
        // int length = ctx.STRING().getText().length();
        // System.out.println(ctx.STRING().getText().substring(1, length-1));
        System.out.println(visit(ctx.term()));
        return null;
    }
    
    @Override 
    public Object visitLoop(placeholderParser.LoopContext ctx) {
        int x = Integer.valueOf(ctx.NUMBER().getText());
        // int length = ctx.stm().length();
        for (int i = 0; i < x; i++) {
            for (placeholderParser.StmContext stat : ctx.stm()) {
                this.visit(stat);
            }
        }
        return null;
    }
}
