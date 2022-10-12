import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Catherine {
    static PrintStream out = System.out;
    public static void main(String [] args) throws FileNotFoundException{
        Scanner kb = new Scanner(new File("catherine.dat"));
        int n = kb.nextInt();
        kb.nextLine();
        
        for(int i = 0; i < n; i++){
            String target = kb.next();
            String guess = kb.next();
            String result = "";

            for(int j = 0; j < guess.length(); j++){
                if(target.contains(""+guess.charAt(j))){
                    if(target.charAt(j) == guess.charAt(j)){
                        result += Character.toString(guess.charAt(j)-32);
                    }else{
                        result += guess.charAt(j);
                    }
                }else{
                    result += "*";
                }
            }
            System.out.println(result);
        }
    }
}
