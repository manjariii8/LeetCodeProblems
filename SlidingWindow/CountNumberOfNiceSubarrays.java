public class CountNumberOfNiceSubarrays {
    private static int findSubarrays(int[] nums, int k){
        int cnt = 0;
        int left = 0;
        int cntOdd = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 != 0){
                cntOdd++;
            }
            while(cntOdd > k){
                if(nums[left] % 2 != 0){
                    cntOdd--;
                }
                left++;
            }
            cnt += (right - left + 1);

        }
        return cnt;

    }
    private static int numberOfSubarrays(int[] nums, int k) {
        return findSubarrays(nums, k) - findSubarrays(nums, k - 1);
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,1,1};
        int k = 3;
        int ans = numberOfSubarrays(nums, k);
        System.out.println(ans);
    }
}
