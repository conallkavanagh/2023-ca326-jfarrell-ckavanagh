import java.util.HashMap;
import java.util.Map;

public class placeholderDisplayVisitor extends placeholderBaseVisitor<Double> {

    Map<String, Double> memory = new HashMap<String, Double>();

    @Override
    public Double visitAssignstmt(placeholderParser.AssignstmtContext ctx) {
        String id = ctx.ID().getText();          // id is left-hand side of '='
        double value = visit(ctx.expression());   // compute value of expression on right
        memory.put(id, value);                   // store it in our memory
        System.out.format("%s = %f", id, value);
        return value;
    }

    /** Terms */
    @Override
    public Double visitTerms(placeholderParser.TermsContext ctx) {
        return visit(ctx.term());
    }

    /** Number */
    @Override
    public Double visitNumber(placeholderParser.NumberContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    @Override
    public Double visitExponent(placeholderParser.ExponentContext ctx) {
        return Math.pow(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override 
    public Double visitPlusMinus(placeholderParser.PlusMinusContext ctx) {
        double left  = visit(ctx.expression(0));
        double right = visit(ctx.expression(1));
        if(ctx.op.getType() == placeholderParser.PLUS) return left + right;
        return left - right; //must be MINUS
    }
    
    @Override 
    public Double visitMultDiv(placeholderParser.MultDivContext ctx) {
        double left  = visit(ctx.expression(0));
        double right = visit(ctx.expression(1));
        if(ctx.op.getType() == placeholderParser.MULT) return left * right;
        return left / right; //must be DIV
    }
    
    @Override 
    public Double visitMinus(placeholderParser.MinusContext ctx) {
        return 0 - visit(ctx.expression());
    }
    
}
