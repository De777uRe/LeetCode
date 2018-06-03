package src.easy;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static final String morseAlphabet[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> transformations = new HashSet<String>(); 
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                sb.append(morseAlphabet[(int)c - 'a']);
            }
            
            transformations.add(sb.toString());
        }
        
        
        return transformations.size();
    }
    
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            
//            
//            
//            int ret = new UniqueMorseCodeWords().uniqueMorseRepresentations(words);
//            
//            String out = String.valueOf(ret);
//            
//            System.out.print(out);
//        }
    }
    
    public static String[] stringToStringArray(String input) {
        return input.split("\\r?\\n");
    }
}
