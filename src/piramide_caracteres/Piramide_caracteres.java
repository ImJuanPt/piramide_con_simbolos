/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide_caracteres;

import java.util.Scanner;

/**
 *
 * @author Juan Miguel
 */
public class Piramide_caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer_str = new Scanner(System.in);
        int altura, aux_altura;
        String espacios = "", signo = "", simbolo;
        System.out.println("Digite el simbolo con el que hara la piramide");
        simbolo = leer_str.nextLine();
        System.out.println("Digite la cantidad de niveles para la piramide: ");
        altura = leer.nextInt();
        aux_altura = altura;

        for (int i = 0; i < aux_altura; i++) {
            String respaldo = "";
            for (int j = altura - 1; j >= 0; j--) {
                respaldo += " ";
                espacios = respaldo;
            }
            respaldo = "";
            //la cantidad de simbolos es proporcional a la altura por dos menos uno, se agrega otra condicion ya que si inicia en 0 
            //y se multiplica por dos y se le resta uno, queda menos 1, por ende se cubre esa condicion con la segunda que aparece en 
            //el ciclo for, en este caso "i" es la altura actual, la cual comienza desde la cuspide
            for (int n = 0; n <= (i*2)-1 || n-1 <= (i*2)-1; n++) {
                respaldo += simbolo;
                signo = respaldo;
            }
            altura--;
            System.out.print(espacios + signo);
            System.out.println("");
        }
    }

}
