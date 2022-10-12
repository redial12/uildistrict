import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;


public class Arusha {
    static PrintStream out = System.out; 
    public static void main(String [] args) throws FileNotFoundException{
        Scanner kb = new Scanner(new File("arusha.dat"));
        int n = kb.nextInt(); 
        kb.nextLine(); 

        for(int i =0; i< n; i++){
            String [] curr= kb.nextLine().split(" ");

            String notation = curr[1];
            while(notation.length()>0){
                if(notation.substring(0,1).equals("L")){
                    curr[0] = curr[0].substring(1)+curr[0].substring(0,1); 
                        notation = notation.substring(1, notation.length());
                }
                //if R 
                else{
                    curr[0] = curr[0].substring(curr[0].length()-1) + curr[0].substring(0,curr[0].length()-1);
                    notation = notation.substring(1, notation.length());


                }
            }
            out.println(curr[0]);
        }



    }
}
