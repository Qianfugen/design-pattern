package qianfg.fun.interpreter;

import java.util.HashMap;

/**
 * 变量值
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
