package qianfg.fun.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式（Interpreter Pattern）：是指给定一个语言(表达式)，定义它的文法的一种表示，并定义一个解释器，
 * 使用该解释器来解释语言中的句子(表达式)
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("解释器模式");
        String expression = getExpression();
//        System.out.println(expression);
        HashMap<String, Integer> variableValue = getVariableValue(expression);
//        System.out.println(variableValue);
        Calcalator calcalator = new Calcalator(expression);
        int result = calcalator.run(variableValue);
        System.out.println(expression + "=" + result);

    }

    /**
     * 获取表达式
     */
    public static String getExpression() throws IOException {
        System.out.println("请输入表达式：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    /**
     * 获取值映射
     */
    public static HashMap<String, Integer> getVariableValue(String expression) throws IOException {
        char[] chars = expression.toCharArray();
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '+' && chars[i] != '-') {
                System.out.println("请输入" + chars[i] + "的值：");
                String value = new BufferedReader(new InputStreamReader(System.in)).readLine();
                result.put(String.valueOf(chars[i]), Integer.valueOf(value));
            }
        }
        return result;
    }
}
