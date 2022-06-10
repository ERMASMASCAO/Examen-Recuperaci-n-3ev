import java.io.IOException;

public class testPersona {

    public static void main(String[] args) throws IOException{
        
    Persona persona1 = new Persona("Daniel", "Prieto", 21, "2092346P", "C/tetuelo");
    persona1.newFromFile();
    
    }
}
