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
	 * Enter a parse tree produced by the {@code init}
	 * labeled alternative in {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterInit(placeholderParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code init}
	 * labeled alternative in {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitInit(placeholderParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterPrint(placeholderParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitPrint(placeholderParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterLoop(placeholderParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link placeholderParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitLoop(placeholderParser.LoopContext ctx);
}