package expression;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceCreate Expr = MainExpression.parse("");
        //if (Expr != null) {
            System.out.println(Expr.evaluate(806379791, 241966139, 1630912446));
        //}
        String test = null;
        System.out.println(test.hashCode());
    }
}
