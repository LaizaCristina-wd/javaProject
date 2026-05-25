package dev.laiza.newproject.introduction;

public class Condicionais03Ternarios {
    public static void main(String[] args) {
       double salario = 6000;
       String Doar = "Eu vou doar 200 reais";
       String NaoDoar = "Ainda não tenho condições, mas vou ter";
       String Resposta = salario > 5000 ? Doar : NaoDoar;
        System.out.println(Resposta);
    }
}