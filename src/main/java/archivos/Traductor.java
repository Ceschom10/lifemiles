package archivos;

/**
 *
 * @author Cesar
 */
public class Traductor {

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    String[] letra = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] binario = {};

    public void traducir(String textoAtraducir, String formatoOrigen, String formatoDestino) {
        String destino = formatoDestino.toUpperCase();
        String origen = formatoOrigen.toUpperCase();
        String texto = textoAtraducir.toUpperCase();

        if (destino.equals("MORSE") && origen.equals("TEXT")) {

            char[] caracter = texto.toCharArray();
            String cadenaMorse = "";

            for (int i = 0; i < caracter.length; i++) {
                System.out.println(caracter[i]);
                for (int j = 0; j < letra.length; j++) {
                    if (caracter[i] == letra[j].charAt(0)) {
                        System.out.println("hhhhhhhhhhhhhhh");
                        System.out.println(caracter);
                        cadenaMorse = cadenaMorse + morse[i] + " |";
                    }

                }

            }

            System.out.println("TRADUCIDO: " + cadenaMorse);
        }

    }

}
