import java.util.HashMap;
import java.util.Map;

public class SubarrayswithKDifferentIntegers {
    private static  int findSubarrays(int[] nums, int k){
        int cnt = 0;
        int left = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0)+ 1);
            while(mp.size() > k){
                int freqCnt = mp.get(nums[left]);
                if(freqCnt == 1){
                    mp.remove(nums[left]);
                }
                else{
                    mp.put(nums[left], freqCnt - 1);
                }
                left++;
            }
            cnt += (right - left + 1);
   
            
        }
        return cnt;
    }
    private static  int subarraysWithKDistinct(int[] nums, int k) {
        return findSubarrays(nums, k) - findSubarrays(nums, k - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        int ans = subarraysWithKDistinct(nums, k);
        System.out.println(ans);
        
    }
}
