package TiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitvos {
    public static void main(String[] args) {
        // Tipos primitivos em Java
        int numeroInteiro = 42; // Tipo inteiro
        double numeroDecimal = 3.14; // Tipo decimal
        char caractere = 'A'; // Tipo caractere
        boolean valorBooleano = true; // Tipo booleano
        float numeroDecimalSimples = 3.14f; // Tipo decimal simples

        // Exibindo os valores
        System.out.println("Número inteiro: " + numeroInteiro); 
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Caractere: " + caractere);
        System.out.println("Valor booleano: " + valorBooleano);
        System.out.printf("Número decimal simples: %.2f%n", numeroDecimalSimples);

        // Leitura de dados do usuário
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f\n", nome, nota);
    }
}

