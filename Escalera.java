import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    class Escalera {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]+".escalera");
        FileWriter fWriter = new FileWriter(f);
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
        for (int j = 0; j < i; j++) {
        fWriter.write(i + " ");
    }
        fWriter.write("\n");
    }
        fWriter.close();
    }
}

