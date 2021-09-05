package qianfg.fun.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {

    public static void main(String[] args) {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("选择所在地");
            System.out.println("1.北京 2.伦敦");
            String str = strin.readLine();
            if (str.equals("1")) {
                new BJOrderPizza();
            } else if (str.equals("2")) {
                new LDOrderPizza();
            } else {
                System.out.println("请选择 1 or 2");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
