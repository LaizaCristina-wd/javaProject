package dev.laiza.newproject.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("nome "+ estudante.nome);
        System.out.println("idade "+ estudante.idade);
        System.out.println("sexo "+ estudante.sexo);
    }
}
