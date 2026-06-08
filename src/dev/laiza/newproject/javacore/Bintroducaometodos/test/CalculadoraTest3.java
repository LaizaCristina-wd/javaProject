package dev.laiza.newproject.javacore.Bintroducaometodos.test;

import dev.laiza.newproject.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,2));
        System.out.println("----------------");
        calculadora.imprimeDivisao(80,0);
    }
}
