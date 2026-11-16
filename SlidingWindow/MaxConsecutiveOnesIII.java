public class MaxConsecutiveOnesIII {
    private static  int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxOnes = 0;
        int zeroCnt = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCnt++;;
            }
            while(zeroCnt > k){
                if(nums[left] == 0){
                    zeroCnt--;
                }
                left++;

            }
            maxOnes = Math.max(maxOnes, right - left + 1);
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = longestOnes(nums, k);
        System.out.println(ans);
    }
}
