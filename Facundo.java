import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Facundo {
    static PrintStream out = System.out;
    public static void main(String [] args) throws FileNotFoundException{
        Scanner kb = new Scanner(new File("facundo.dat"));
        int n = kb.nextInt();
        kb.nextLine();

        for(int i = 0; i < n; i++){
            String curr = kb.next();
            Stack<Character> currStack = new Stack<Character>();
            for(int y =0; y <curr.length();y++){
                currStack.add(curr.charAt(y));
            }
            int shuffle = kb.nextInt();

            out.println(shuffleTimes(currStack, shuffle));
            //out.println(shuffleM(currStack));
            out.println("============");
            kb.nextLine();
        }
    }
    public static Stack<Character> shuffleM(Stack<Character> input){
        ArrayList<Character> stackToArr= new ArrayList<Character>();
        String curr = "";
        while(!input.isEmpty()){
            stackToArr.add(input.pop());
        }

        while(!stackToArr.isEmpty()){
            curr += stackToArr.remove(stackToArr.size() - 1);
        }

        int half = curr.length() / 2;
        ArrayList<Character> firstDeck = new ArrayList<Character>();
        ArrayList<Character> secondDeck = new ArrayList<Character>();
        Stack<Character> finalDeck = new Stack<Character>();

        if(curr.length()%2==0){
            for(int j = 0; j < curr.length(); j++){
                if(j < half){
                    firstDeck.add(curr.charAt(j));
                }else{
                    secondDeck.add(curr.charAt(j));
                }
            }

        }else{
            for(int j = 0; j < curr.length(); j++){
                if(j < half + 1){
                    firstDeck.add(curr.charAt(j));
                }else{
                    secondDeck.add(curr.charAt(j));
                }
            }
        }

        // out.println(firstDeck);
        // out.println(secondDeck);

        while(!secondDeck.isEmpty()){
            finalDeck.add(firstDeck.remove(firstDeck.size() - 1));
            finalDeck.add(secondDeck.remove(secondDeck.size() - 1));
        }
        //if the first deck has more than second
        if(!firstDeck.isEmpty()){
            finalDeck.add(firstDeck.remove(firstDeck.size() - 1));
        }

        //out.println(finalDeck);

        return finalDeck;
    }
    public static Stack<Character> shuffleTimes(Stack<Character> input, int shufflex){
        if(shufflex == 0){
            return input;
        }else{
        Stack<Character> output = shuffleM(input);
        return shuffleTimes(output, shufflex - 1);
        }
    }
}
