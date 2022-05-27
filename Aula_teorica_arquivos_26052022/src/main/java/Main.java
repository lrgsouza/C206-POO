import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com a frase para codificar");
        String message = in.nextLine();


        CesarCipher cipher = new CesarCipher();

        StringBuilder cipheredMessage = cipher.cipher(message, 3);
        System.out.println(cipheredMessage);



        try {
            Path arquivo = Paths.get("texto.txt");
            //escrevendo
            Files.writeString(arquivo,cipheredMessage);

        }catch (IOException e){
            System.out.println("Problema com arquivo:");
            e.printStackTrace();
        }

        try {
            Path arquivo = Paths.get("texto.txt");
            String message_1 = Files.readString(arquivo);
            StringBuilder decipheredMessage = cipher.decipher(String.valueOf(message_1),3);
            System.out.println(decipheredMessage);
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
