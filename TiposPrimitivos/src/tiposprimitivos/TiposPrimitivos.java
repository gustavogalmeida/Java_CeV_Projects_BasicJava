package tiposprimitivos;
import java.util.Scanner;
/**
 * @author Gustavo Almeida
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scannerSystemIn = new Scanner (System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scannerSystemIn.nextLine();
        System.out.print("Digite sue peso: ");
        float peso = scannerSystemIn.nextFloat();
        
        System.out.printf("O peso de %s e: %.3f.\n", nome, peso);
        
        
    }    
}
