import java.util.*;

public class atv {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor de 1 a 255");

        int valor = entrada.nextInt();

        String bin = "";
        String codigo = "";

        while (valor % 2 == 0) {
            valor = valor / 2;
            bin = 0 + bin;
            
        }

        while (valor % 2 == 1) {
            valor = (valor - 1) / 2;
            bin = 1 + bin;
        }

        if (valor > 0) 
            codigo = valor + bin;
        else
            codigo = bin;

        System.out.println("O número informado em código binário é: " + codigo);

    }
}
