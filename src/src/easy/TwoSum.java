package src.easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int retVal[] = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    retVal[0] = i;
                    retVal[1] = j;
                    return retVal;
                }
            }
        }
        
        return retVal;
    }
    
    public static void main (String args[]) {
        int input[] = {2, 7, 11, 15};
        int target = 9;
        
        TwoSum testObj = new TwoSum();
        int[] resultSet = testObj.twoSum(input, target);
        for (int i : resultSet) {
            System.out.print(i + " ");
        }
    }
}
