package dev.laiza.newproject.javacore.Bintroducaometodos.test;

import dev.laiza.newproject.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CalculadoraTest4");
        System.out.println("Num1"+ num1);
        System.out.println("Num2" +num2);
    }
}
