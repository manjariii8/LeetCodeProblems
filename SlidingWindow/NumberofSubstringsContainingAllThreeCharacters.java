public class NumberofSubstringsContainingAllThreeCharacters {
    private static int numberOfSubstrings(String s) {
        int cnt = 0;
        int left = 0;
        int[] freq = new int[3];
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            freq[curr - 'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                cnt+=  s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;

            }
            
        }
        return cnt;
    }
    public static void main(String[] args) {

        String s = "abcabc";
        int ans = numberOfSubstrings(s);
        System.out.println(ans);
        
    }
    
}
