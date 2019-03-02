/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_joser;


public class CifradoCesar {
    public static String cifrado(String palabra, int cantidad) {
        StringBuilder cifrado = new StringBuilder();
        cantidad = cantidad % 26;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z') {
                if ((palabra.charAt(i) + cantidad) > 'z') {
                    cifrado.append((char) (palabra.charAt(i) + cantidad - 26));
                } else {
                    cifrado.append((char) (palabra.charAt(i) + cantidad));
                }
            } else if (palabra.charAt(i) >= 'A' && palabra.charAt(i) <= 'Z') {
                if ((palabra.charAt(i) + cantidad) > 'Z') {
                    cifrado.append((char) (palabra.charAt(i) + cantidad - 26));
                } else {
                    cifrado.append((char) (palabra.charAt(i) + cantidad));
                }
            }
        }
        return cifrado.toString();
    }

    
    public static String descifrado(String palabra, int cantidad) {
        StringBuilder descifrado = new StringBuilder();
        cantidad = cantidad % 26;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z') {
                if ((palabra.charAt(i) - cantidad) < 'a') {
                    descifrado.append((char) (palabra.charAt(i) - cantidad + 26));
                } else {
                    descifrado.append((char) (palabra.charAt(i) - cantidad));
                }
            } else if (palabra.charAt(i) >= 'A' && palabra.charAt(i) <= 'Z') {
                if ((palabra.charAt(i) - cantidad) < 'A') {
                    descifrado.append((char) (palabra.charAt(i) - cantidad + 26));
                } else {
                    descifrado.append((char) (palabra.charAt(i) - cantidad));
                }
            }
        }
        return descifrado.toString();
    }
}

