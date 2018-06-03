package src.easy;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int hammingDist = 0;
        
        String xBinary = "";
        String yBinary = "";
        
        while (x > 0 || y > 0) {
            if (x > 0) {
                xBinary = ( (x % 2) == 0 ? "0" : "1") + xBinary;
                x /= 2;
            }
            if (y > 0) {
                yBinary = ( (y % 2) == 0 ? "0" : "1") + yBinary;
                y /= 2;
            }
        }
        
        while (xBinary.length() != yBinary.length()) {
            while (xBinary.length() < yBinary.length()) {
                xBinary = "0" + xBinary;
            }
            while (yBinary.length() < xBinary.length()) {
                yBinary = "0" + yBinary;
            }
        }
        
        for (int i = 0; i < xBinary.length(); i++) {
            if (xBinary.charAt(i) != yBinary.charAt(i)) {
                hammingDist++;
            }
        }
        
        return hammingDist;
    }
    
    public int hammingDistanceXOR(int x, int y) {
        int hammingDist = Integer.bitCount(x ^ y);
        
        return hammingDist;
    }
    
    public static void main (String args[]) {
        int x = 1;
        int y = 4;
        HammingDistance testObj = new HammingDistance();
        System.out.println(testObj.hammingDistance(x, y));
        System.out.println(testObj.hammingDistanceXOR(x, y));
    }
}
