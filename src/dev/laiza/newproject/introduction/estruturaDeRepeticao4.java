package dev.laiza.newproject.introduction;

public class estruturaDeRepeticao4 {
    // dado o valor do carro, descubra quantas parcelas pode ser pago.
    // Condição valorParcela> =1000;
    public static void main(String[] args) {
       double valorTotal = 30000;
       for (int parcela = 1; parcela<=valorTotal; parcela++){
           double valorParcela = valorTotal / parcela;
           if(valorParcela < 1000){
               break;
           }
           System.out.println("Parcelas "+ parcela+ " R$"+ valorParcela);
       }
    }
}
