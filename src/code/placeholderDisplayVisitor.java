import java.util.HashMap;
import java.util.Map;

public class placeholderDisplayVisitor extends placeholderBaseVisitor<Float> {

    Map<String, Float> memory = new HashMap<String, Float>();

    @Override
    public Float visitAssignstmt(placeholderParser.AssignstmtContext ctx) {
        String id = ctx.ID().getText();          // id is left-hand side of '='
        float value = visit(ctx.expression());   // compute value of expression on right
        memory.put(id, value);                   // store it in our memory
        System.out.format("%s = %f", id, value);
        return value;
    }

    /** NUMBER */
    @Override
    public Float visitTerms(placeholderParser.TermsContext ctx) {
        return Float.valueOf(ctx.term().getText());
    }
}
