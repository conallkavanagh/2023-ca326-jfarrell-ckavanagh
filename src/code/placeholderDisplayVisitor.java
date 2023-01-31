import java.util.HashMap;
import java.util.Map;

public class placeholderDisplayVisitor extends placeholderBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssignstmt(placeholderParser.AssignstmtContext ctx) {
        String id = ctx.Id().getText();  // id is left-hand side of '='
        int value = visit(ctx.expression());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        return value;
    }
}
