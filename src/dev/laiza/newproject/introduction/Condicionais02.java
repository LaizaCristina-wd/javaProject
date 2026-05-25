package dev.laiza.newproject.introduction;

public class Condicionais02 {
    public static void main(String[] args) {
        int idade = 10;
        String categoria;
        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);;
    }
}
