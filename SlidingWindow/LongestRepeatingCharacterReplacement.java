public class  LongestRepeatingCharacterReplacement{
    public static int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;
        int left = 0;
        int freq[] = new int[26];
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            freq[curr - 'A']++;

            maxFreq = Math.max(maxFreq, freq[curr - 'A']);
            int windowSize = right - left + 1;

            int charcterChanges = windowSize - maxFreq;
            if(charcterChanges <= k){
                maxLen = Math.max(maxLen, windowSize);

            }
            else{
                freq[s.charAt(left) - 'A']--;
                left++;
            }

        }
        return maxLen;
    
    }
    public static void main(String[] args) {
        String s =  "BAABAABBBAAA";
        int k = 2;
        int ans = characterReplacement(s, k);
        System.out.println(ans);
        
    }
}