import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Michaela {
    public static void main(String [] args) throws FileNotFoundException{
        PrintStream out = System.out;
        Scanner scan = new Scanner(new File("michaela.dat"));
        int n = scan.nextInt();
        scan.nextLine();

        HashMap<Character, String> bob = new HashMap<Character, String>();
        bob.put(' ', "-.....");
        bob.put('A',"-.....-");
        bob.put('B',"-....-.");
        bob.put('C',"-....--");
        bob.put('D',"-...-..");
        bob.put('E',"-...-.-");
        bob.put('F',"-...--.");
        bob.put('G',"-...---");
        bob.put('H',"-..-...");
        bob.put('I',"-..-..-");
        bob.put('J',"-..-.-.");
        bob.put('K',"-..-.--");
        bob.put('L',"-..--..");
        bob.put('M',"-..--.-");
        bob.put('N',"-..---.");
        bob.put('O',"-..----");
        bob.put('P',"-.-....");
        bob.put('Q',"-.-...-");
        bob.put('R',"-.-..-.");
        bob.put('S',"-.-..--");
        bob.put('T',"-.-.-..");
        bob.put('U',"-.-.-.-");
        bob.put('V',"-.-.--.");
        bob.put('W',"-.-.---");
        bob.put('X',"-.--...");
        bob.put('Y',"-.--..-");
        bob.put('Z',"-.--.-.");

        for(int i = 0; i < n; i++){
            String current = scan.nextLine();
            current = current.toUpperCase();
            String morse = "Message #"+(i+1) + ": ";
            for(int j = 0; j < current.length(); j++){
                morse += bob.get(current.charAt(j));
                morse += " ";
            }
            System.out.println(morse);
        }

        
    }
}
