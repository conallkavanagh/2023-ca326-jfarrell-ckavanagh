import java.util.HashMap;
import java.util.Map;

public class placeholderDisplayVisitor extends placeholderBaseVisitor<String>{

    Map<String, String> memory = new HashMap<String, String>();

    @Override
    public String visitAssignstmt(placeholderParser.AssignstmtContext ctx) {
        String id = ctx.ID().getText();          // id is left-hand side of '='
        String value = visit(ctx.expression());   // compute value of expression on right
        memory.put(id, value);                   // store it in our memory
        System.out.format("%s = %s\n", id, value);
        return value;
    }


    /** Terms */
    @Override
    public String visitTerms(placeholderParser.TermsContext ctx) {
        return visit(ctx.term());
    }

    /** Number */
    @Override
    public String visitNumber(placeholderParser.NumberContext ctx) {
        return ctx.getText();
    }

    /** ID */
    @Override
    public String visitId(placeholderParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return null;
    }

    @Override
    public String visitString(placeholderParser.StringContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBool(placeholderParser.BoolContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExponent(placeholderParser.ExponentContext ctx) {
        Double d = Math.pow(Double.valueOf(visit(ctx.expression(0))), Double.valueOf(visit(ctx.expression(1))));
        String ans = String.valueOf(d);
        return ans;
    }

    @Override 
    public String visitPlusMinus(placeholderParser.PlusMinusContext ctx) {
        double left  = Double.valueOf(visit(ctx.expression(0)));
        double right = Double.valueOf(visit(ctx.expression(1)));
        if(ctx.op.getType() == placeholderParser.PLUS){
            double d = left + right;
            String ans = String.valueOf(d);
            return ans;
        } else {
            double d = left - right; //must be MINUS
            String ans = String.valueOf(d);
            return ans;
        }
    }
    
    @Override 
    public String visitMultDiv(placeholderParser.MultDivContext ctx) {
        double left  = Double.valueOf(visit(ctx.expression(0)));
        double right = Double.valueOf(visit(ctx.expression(0)));
        if(ctx.op.getType() == placeholderParser.MULT){
            double d = left * right;
            String ans = String.valueOf(d);
            return ans;
        } else {
            double d = left / right; //must be DIV
            String ans = String.valueOf(d);
            return ans;
        }
    }
    
    @Override 
    public String visitMinus(placeholderParser.MinusContext ctx) {
        double d = 0 - Double.valueOf(visit(ctx.expression()));
        String ans = String.valueOf(d);
        return ans;
    }
    
    @Override 
    public String visitSay(placeholderParser.SayContext ctx) {
        // int length = ctx.STRING().getText().length();
        // System.out.println(ctx.STRING().getText().substring(1, length-1));
        System.out.println(visit(ctx.term()));
        return "";
    }
    
    @Override 
    public String visitLoop(placeholderParser.LoopContext ctx) {
        int x = Integer.valueOf(ctx.NUMBER().getText());
        // int length = ctx.stm().length();
        for (int i = 0; i < x; i++) {
            for (placeholderParser.StmContext stat : ctx.stm()) {
                this.visit(stat);
            }
        }
        return "";
    }
}
