package cz.jalasoft.calculator.formula;

/**
 *  An operator representing an arithmetic operator performing
 *  operations on numbers.
 *
 *  This class also provides factory methods for providing
 *  basic operators like add, subtract or multiply.
 *
 * @author Honza Lastovicka (lastovicka@avast.com)
 * @since 2016-11-03.
 */
public interface ArithmeticOperator<T extends Number> extends Operator<T> {

    static Operator<Number> add() {
        return new Operator<Number>() {
            @Override
            public Number apply(Number leftOperand, Number righOperand) {
                return leftOperand.doubleValue() + righOperand.doubleValue();
            }

            @Override
            public String toString() {
                return "Operator[+]";
            }
        };
    }

    static Operator<Number> subtract() {
        return new Operator<Number>() {
            @Override
            public Number apply(Number leftOperand, Number righOperand) {
                return leftOperand.doubleValue() - righOperand.doubleValue();
            }

            @Override
            public String toString() {
                return "Operato[-]";
            }
        };
    }

    static Operator<Number> divide() {
        return new Operator<Number>() {
            @Override
            public Number apply(Number leftOperand, Number righOperand) {
                return leftOperand.doubleValue() / righOperand.doubleValue();
            }

            @Override
            public String toString() {
                return "Operator[/]";
            }
        };
    }

    static Operator<Number> multiply() {
        return new Operator<Number>() {
            @Override
            public Number apply(Number leftOperand, Number righOperand) {
                return leftOperand.doubleValue() * righOperand.doubleValue();
            }

            @Override
            public String toString() {
                return "Operator[*]";
            }
        };
    }

    //------------------------------------------------------------------
    //INTERFACE
    //------------------------------------------------------------------

    @Override
    T apply(T leftOperand, T rightOperand);
}
