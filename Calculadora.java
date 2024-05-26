// Clase para la calculadora genérica
public class Calculadora<T extends Number> {

    // Método para sumar dos números
    public T suma(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        }
        throw new IllegalArgumentException("Error, número no valido");
    }
    
    // Método para restar dos números
    public T resta(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        }
        throw new IllegalArgumentException("Error, numero no valido");
    }

    // Método para multiplicar dos números
    public T multiplicacion(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        }
        throw new IllegalArgumentException("Error, numero no valido");
    }

    // Método para dividir dos números
    public T division(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("División por cero");
        }
        if (a instanceof Integer && b instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        }
        throw new IllegalArgumentException("Error, numero no valido");
    }

    public static void main(String[] args) {
        Calculadora<Integer> intCalc = new Calculadora<>();
        System.out.println("Calculadora de Enteros:");
        System.out.println("Suma: " + intCalc.suma(5, 3));
        System.out.println("Resta: " + intCalc.resta(5, 3));
        System.out.println("Multiplicación: " + intCalc.multiplicacion(5, 3));
        System.out.println("División: " + intCalc.division(5, 3));

        Calculadora<Double> doubleCalc = new Calculadora<>();
        System.out.println("\nCalculadora de Doubles:");
        System.out.println("Suma: " + doubleCalc.suma(5.0, 3.0));
        System.out.println("Resta: " + doubleCalc.resta(5.0, 3.0));
        System.out.println("Multiplicación: " + doubleCalc.multiplicacion(5.0, 3.0));
        System.out.println("División: " + doubleCalc.division(5.0, 3.0));
    }
}
