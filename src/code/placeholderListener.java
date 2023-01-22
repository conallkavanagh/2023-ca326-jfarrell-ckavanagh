// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link placeholderParser}.
 */
public interface placeholderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link placeholderParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(placeholderParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(placeholderParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStm(placeholderParser.StmContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStm(placeholderParser.StmContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#say}.
	 * @param ctx the parse tree
	 */
	void enterSay(placeholderParser.SayContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#say}.
	 * @param ctx the parse tree
	 */
	void exitSay(placeholderParser.SayContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(placeholderParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(placeholderParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#boolexpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpression(placeholderParser.BoolexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#boolexpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpression(placeholderParser.BoolexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(placeholderParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(placeholderParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(placeholderParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(placeholderParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(placeholderParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(placeholderParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link placeholderParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(placeholderParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link placeholderParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(placeholderParser.LoopContext ctx);
}