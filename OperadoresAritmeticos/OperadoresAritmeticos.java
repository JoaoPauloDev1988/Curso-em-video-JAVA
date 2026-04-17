package OperadoresAritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        //Operadores Aritméticos

        // Soma
        int soma = a + b;// Soma dos dois números
        System.out.println("Soma: " + soma);

        // Subtração
        int subtracao = a - b;// Diferença entre os dois números
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        int multiplicacao = a * b;// Produto dos dois números
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        int divisao = a / b;// Divisão inteira
        System.out.println("Divisão: " + divisao);

        // Módulo
        int modulo = a % b;// Resto da divisão
        System.out.println("Módulo: " + modulo);



        // Operadores de Incremento e Decremento
        


        // Incremento
        a++; // Incrementa o valor de a em 1
        System.out.println("Incremento: " + a);

        // Decremento
        a--; // Decrementa o valor de a em 1
        System.out.println("Decremento: " + a);

        //Pré-incremento


        int numero = 5;
        int valor = 4;


        int preIncremento = valor + ++numero; // Incrementa a antes de usar o valor
        System.out.println("Pré-incremento: " + preIncremento);
        System.out.println("Valor de numero após pré-incremento: " + numero); // Verifica o valor de numero após o pré-incremento

        //Pós-incremento
        int posIncremento = valor + numero++; // Usa o valor de a antes de incrementá-lo
        System.out.println("Pós-incremento: " + posIncremento);
        System.out.println("Valor de numero após pós-incremento: " + numero); // Verifica o valor de numero após o pós-incremento

        //Pré-decremento
        int preDecremento = valor + --numero; // Decrementa a antes de usar o valor
        System.out.println("Pré-decremento: " + preDecremento);
        System.out.println("Valor de numero após pré-decremento: " + numero); // Verifica o valor de numero após o pré-decremento

        //Pós-decremento
        int posDecremento = valor + numero--; // Usa o valor de a antes de decrementá-lo
        System.out.println("Pós-decremento: " + posDecremento);
        System.out.println("Valor de numero após pós-decremento: " + numero); // Verifica o valor de numero após o pós-decremento

    }
}
