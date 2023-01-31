import java.util.HashMap;
import java.util.Map;

public class placeholderDisplayVisitor extends placeholderBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssignstmt(placeholderParser.AssignstmtContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = Integer.valueOf(ctx.expression().getText());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        System.out.format("%s = %d", id, value);
        return value;
    }

    // /** INT */
    // @Override
    // public Integer visit(LabeledExprParser.IntContext ctx) {
    //     return Integer.valueOf(ctx.INT().getText());
    // }
}
