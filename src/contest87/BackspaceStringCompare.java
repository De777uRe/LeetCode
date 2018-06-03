package contest87;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder resolveS = new StringBuilder();
        StringBuilder resolveT = new StringBuilder();
        
        for (char c : S.toCharArray()) {
            if (c != '#') {
                resolveS.append(c);
            }
            else {
                if (resolveS.length() > 0)
                    resolveS.delete(resolveS.length() - 1, resolveS.length());
            }
        }
        
        for (char c : T.toCharArray()) {
            if (c != '#') {
                resolveT.append(c);
            }
            else {
                if (resolveT.length() > 0)
                    resolveT.delete(resolveT.length() - 1, resolveT.length());
            }
        }
        
        return resolveS.toString().equals(resolveT.toString());
    }
    
    public static void main (String args[]) {
        BackspaceStringCompare testObj = new BackspaceStringCompare();
        System.out.println(testObj.backspaceCompare("ab##", "c#d#"));
    }
}
