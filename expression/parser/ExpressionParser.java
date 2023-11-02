package expression.parser;

import expression.InterfaceCreate;
import expression.MainExpression;
import expression.TripleExpression;

public class ExpressionParser implements TripleParser{
    @Override
    public InterfaceCreate parse(String expression) {
        return MainExpression.parse(expression);
    }
}
