package dev.laiza.newproject.javacore.Bintroducaometodos;

import dev.laiza.newproject.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest1");
        calculadora.subtraiDoisNumeros();
    }
}
