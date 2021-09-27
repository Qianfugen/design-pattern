package qianfg.fun.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap 键值对, 可以获取到变量的值
 */
public abstract class Expression {
    abstract int interpreter(HashMap<String, Integer> var);
}
