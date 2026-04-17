package TesteTipos;

public class TesteTipos {
    
    public static void main(String[] args) {

        int idade = 30;// Convertendo um inteiro para String
        String valor = Integer.toString(idade);
        System.out.println(valor);

        String idade1 = "20";// Convertendo uma String para inteiro
        int valor2 = Integer.parseInt(idade1);
        System.out.println(valor2);

        String valor3 = "30.5";// Convertendo uma String para float 
        float valor4 = Float.parseFloat(valor3);
        System.out.println(valor4);
    }

}
