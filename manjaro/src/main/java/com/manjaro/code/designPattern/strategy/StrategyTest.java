package com.manjaro.code.designPattern.strategy;

/**
 * created by iriwen on 2020/05/08.
 */
public class StrategyTest {

    public static void main(String[] args) {

        Strategy strategy = new ConcreteStrategy1();

        StrategyContext context = new StrategyContext(strategy);

        double calculate = context.calculate(20.3);
    }


    public int test() {
        return 1;
    }
}
