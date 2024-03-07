import java.util.Arrays;

class Solution {
    public int numBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        
        return boats;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] people = {1, 2};
        int limit = 3;
        System.out.println(solution.numBoats(people, limit));
    }
}
