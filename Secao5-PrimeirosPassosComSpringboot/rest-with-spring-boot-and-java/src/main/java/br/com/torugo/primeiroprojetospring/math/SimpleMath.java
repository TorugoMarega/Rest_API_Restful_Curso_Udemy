package br.com.torugo.primeiroprojetospring.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }


    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }


    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }


    public Double average(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }


    public Double squareroot(Double numberOne) {
        return Math.sqrt(numberOne);
    }


    public Double power(Double numberOne, Double numberTwo) {
        return Math.pow(numberOne, numberTwo);
    }
}
