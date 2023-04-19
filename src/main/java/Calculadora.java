public class Calculadora {
    double suma(double a, double b) {
        return a + b;
    }

    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplicar(double a, double b) {
        return Math.abs(a * b);
    }

    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    int divideenteros(int dividendo, double divisor){
        if (divisor >0) {
            return (int) (dividendo / divisor);
        }

        return dividendo;
    }
    double multiplicaEnteroyNegativo(double a, double b) {
        return Math.abs(a * b);
    }
    double raizCuadrada (double radicando){
        return Math.sqrt(radicando);
        
    }

    public int multiplica(int a, int b) {
        return a * b;
    }
}
