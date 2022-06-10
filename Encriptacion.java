import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class Encriptacion {
        public static void main(String[] args) throws IOException {

        File fIn = new File("fichaEntrada.txt");
        File fOut = new File("fichSalida.encriptado");
        BufferedReader bfReader = new BufferedReader(new FileReader(fIn));
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(fOut));
        while(bfReader.ready()) {
            String linea = bfReader.readLine();
            linea = linea.toLowerCase();
            String lineaNueva = "";
        for (int i = 0; i < linea.length(); i++) {
            char esteChar = linea.charAt(i);
            if(esteChar == 'a'|| esteChar == 'i' || esteChar == 'e' ||
                esteChar == 'u' || esteChar == 'o') {
                lineaNueva += esteChar;
            }
            else if(esteChar == ' ') {
                lineaNueva += "_";
            }
            else {
            lineaNueva += "*";
            }
        }
        bWriter.append(lineaNueva);
        bWriter.append("\n");

        }
        bWriter.close();
        bfReader.close();
    }
}
