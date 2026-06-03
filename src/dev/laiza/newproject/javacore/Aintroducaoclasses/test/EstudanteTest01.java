package dev.laiza.newproject.javacore.Aintroducaoclasses.test;

import dev.laiza.newproject.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Laiza";
        estudante.idade = 27;
        estudante.sexo = 'F';

    System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
    }
}
