package Loja;

import java.util.Scanner;

public class Exercicio01B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "RTX 3090 TI";
        System.out.print("POR FAVOR, INFORME A QUANTIDADE DO PRODUTO: " + nome + " ");
        Integer quantidadeEstoque = scanner.nextInt();
        Boolean temEstoque = quantidadeEstoque < 10;
        if (temEstoque) {
            System.out.println("O PRODUTO " + nome + " ESTÁ ABAIXO DO ESTOQUE, POR FAVOR, REPONHA A MERCADORIA!");
        } else {
            System.out.println("O PRODUTO " + nome + " ESTÁ ACIMA DO ESTOQUE, NÃO PRECISA REPOR A MERCADORIA!");
        }
    }
}

