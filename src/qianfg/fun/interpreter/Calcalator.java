package qianfg.fun.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 算法解释器
 */
public class Calcalator {

    private Expression expression;

    public Calcalator(String expStr) {
        char[] chars = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        Stack<Expression> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }

        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
