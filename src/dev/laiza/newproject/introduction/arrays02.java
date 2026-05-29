package dev.laiza.newproject.introduction;

public class arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Bulma";
        nomes[1] = "Titi";
        nomes[2] = "Piccolo";
        nomes[3] = "Kulilin";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
