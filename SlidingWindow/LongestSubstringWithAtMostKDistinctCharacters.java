import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
    private static  int longestKSubstr(String s, int k) {
        // code here
        int left = 0;
        int maxLen = -1;
        Map<Character,Integer> mp = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            mp.put(curr, mp.getOrDefault(curr, 0) + 1);
            
            while(mp.size() > k){
                int freqCnt = mp.get(s.charAt(left));
                if(freqCnt == 1){
                   mp.remove(s.charAt(left));
                }
                else{
                     mp.put(s.charAt(left), freqCnt - 1);
                }
                left++;

            }
            if(mp.size() == k) maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int k = 2;
        int ans = longestKSubstr(s, k);

        System.out.println(ans);
    }
}
