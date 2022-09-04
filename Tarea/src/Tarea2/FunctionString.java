package Tarea2;

import java.util.*;
public class FunctionString {
    /**
     *
     * @param text reversing String text
     * @return reversed String
     */
    public static String Reverse(String text){
        char[] letters = text.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for(int i = letters.length-1;i > -1; i--){
            reversed.append(letters[i]);

        }
        return reversed.toString();
    }

    /**
     *
     * @param text  String where to look for
     * @param find String to look for
     * @return INT the occurrences
     */
    public static long Occurrences(String text, String find ){
    String[] splittedText = text.split(" ");
        return Arrays.stream(splittedText)
                .filter(txt -> txt.toLowerCase().contains(find.toLowerCase()))
                .count();

    }
}
