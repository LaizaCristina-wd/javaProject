package dev.laiza.newproject.introduction;

public class Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);
        //%
        int resto = 21 % 2;
        System.out.println(resto);
        //logicos<> <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+ isDezIgualVinte);
        System.out.println("isDezIgualDez: "+ isDezIgualDez);
        System.out.println("isDezDiferentelDez: "+ isDezDiferenteDez);

        //&& ||
        int idade = 31;
        float salarioMenor = 3500F;
        float salarioMaior = 4635F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salarioMaior >= 4635;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salarioMenor >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel "+ isPlaystationCompravel);

        //= += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
