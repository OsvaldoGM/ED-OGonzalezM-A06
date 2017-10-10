*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a06;

import java.util.Arrays;


/**
 *
 * @author HONORIO ZAIBACK
 */
public class EDOGonzalezMA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <String> pila = new  Stack();
        String palabra;
        palabra = "anita lava la tina";
        palabra = palabra.replaceAll(" ", "");
        char[] charArray= palabra.toCharArray();
        int x = charArray.length;
        String b = "";
        
        pila = subir(charArray,pila);
        //b = "bob";
        b = bajar(b,pila);
        Comparar(charArray,b);
    }
    
    public static Stack subir(char a[], Stack pila){
        for(int i=0; i<a.length; i++){
            pila.push(a[i]);
        }
        return pila;
    }
    
    public static String bajar(String b, Stack pila){
        int size=pila.getSize();
        for(int i=0; i<size; i++){
           b += pila.pop().toString();
        }
        return b;
    }
    
    public static boolean Comparar(char a[], String b){
        char[] azul = b.toCharArray();
            if(Arrays.equals(a, azul)){
                System.out.println("Si es un palindromo");
                return true;
            }
        System.out.println("No es palindromo");
                return false;
    }
}
