package contest87;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestMountainInArray {
    public int longestMountain(int[] A) {
        int mountain = 0;
        int longestMountain = 0;
        boolean ascending = true;
        boolean didDescent = false;
        
        List<Integer> mountains = new ArrayList<Integer>();
        mountains.add(0);
        
        int start = -1;
        for (int j = 0; j < A.length-1; j++) {
            if (A[j] < A[j+1]) {
                start = j;
                break;
            }
        }
       
        if (start != -1) {
            int i = start;
            while (i < A.length - 1) {
                if (A[i] == A[i + 1]) {
                    if (mountain > 0 && didDescent) {
                        longestMountain = mountain + 1;
                        mountains.add(longestMountain);
                    }
                    else {
                        mountain = 0;
                        ascending = true;
                        i++;
                        continue;
                    }
                }
                if (ascending) {
                    didDescent = false;
                    if (A[i] < A[i + 1]) {
                        mountain++;
                    } 
                    else if (A[i] > A[i + 1]) {
                        if (mountain > 0) {
                            mountain++;
                            ascending = false;
                            didDescent = true;
                            if (i == A.length - 2) {
                                longestMountain = mountain + 1;
                                mountains.add(longestMountain);
                            }
                        }
                    } 
                    else {
                        mountain = 0;
                    }
                } 
                else {
                    if (A[i] > A[i + 1]) {
                        mountain++;
                        if (i == A.length - 2) {
                            longestMountain = mountain + 1;
                            mountains.add(longestMountain);
                        }
                    } 
                    else {
                        longestMountain = mountain + 1;
                        mountains.add(longestMountain);
                        mountain = 0;
                        i--;
                        ascending = true;
                    }
                }
                i++;
            }
        }
        
        return Collections.max(mountains);
    }
    
    public static void main (String args[]) {
        int A[] = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int B[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int C[] = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int D[] = {0, 1, 0};
        int E[] = {1, 2, 0, 2, 0, 2};
        int F[] = {2, 3, 3, 2, 0, 2};
        int G[] = {875, 884, 239, 731, 723, 685};
        int H[] = {0, 0, 1, 0, 0, 1, 1, 1, 1, 1};
        int I[] = {0, 2, 2};
        LongestMountainInArray testObj = new LongestMountainInArray();
        System.out.println("11: " + testObj.longestMountain(A));
        System.out.println("0: " + testObj.longestMountain(B));
        System.out.println("11: " + testObj.longestMountain(C));
        System.out.println("3: " + testObj.longestMountain(D));
        System.out.println("3: " + testObj.longestMountain(E));
        System.out.println("0: " + testObj.longestMountain(F));
        System.out.println("4: " + testObj.longestMountain(G));
        System.out.println("3: " + testObj.longestMountain(H));
        System.out.println("0: " + testObj.longestMountain(I));
    }
}
