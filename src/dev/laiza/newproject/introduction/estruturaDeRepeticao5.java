package dev.laiza.newproject.introduction;

public class estruturaDeRepeticao5 {
    // dado o valor do carro, descubra quantas parcelas pode ser pago.
    // Condição valorParcela> =1000;
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }
        }
    }

