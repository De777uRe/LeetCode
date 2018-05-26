package src.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        
        for (char jewel : J.toCharArray()) {
            for (char stone : S.toCharArray()) {
                if (jewel == stone) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String J = line.toString();
            line = in.readLine();
            String S = line.toString();
            
            int ret = new JewelsAndStones().numJewelsInStones(J, S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

