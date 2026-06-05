package dev.laiza.newproject.javacore.Aintroducaoclasses.test;

import dev.laiza.newproject.javacore.Aintroducaoclasses.dominio.Professor;

public class professorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "DevDojo";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println("\nNome: "+professor.nome + "\nIdade: "+ professor.idade + "\nSexo: "+professor.sexo);
    }
}
