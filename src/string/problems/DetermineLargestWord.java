package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        String min = null;
        String max = "";

        wordNLength.put(1, "Human");
        wordNLength.put(2, "brain");
        wordNLength.put(3, "is");
        wordNLength.put(4, "a");
        wordNLength.put(5, "biological");
        wordNLength.put(6, "learning");
        wordNLength.put(7, "machine");



    }








    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}
