package ejercicios.calculadora;

public class Calculadora {
    public Integer suma(Integer a, Integer b) {
        return a+b;
    }

    public Integer multi(Integer a, Integer b) {
        return a*b;
    }

    public Float div(Integer a, Integer b) {
        return (float)a/b;
    }

    public Double pow(Integer base, Integer exp) {
        return Math.pow(base, exp);
    }

}