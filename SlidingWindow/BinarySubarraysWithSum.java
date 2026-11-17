public class BinarySubarraysWithSum {
    private static int findSubarrays(int[] nums, int goal){
        int left = 0;
        int cnt = 0;
        int currSum = 0;
        for(int right = 0; right < nums.length; right++){
            currSum += nums[right];
            while(currSum > goal){
                currSum -= nums[left];
                left++;
            }
            cnt += (right - left + 1);


        }
        return cnt;

    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        if(goal <= 0) return findSubarrays(nums, goal);
        return findSubarrays(nums, goal) - findSubarrays(nums, goal - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int ans = numSubarraysWithSum(nums, goal);
        System.out.println(ans);
    }
}
