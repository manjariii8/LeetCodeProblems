public  class VowelsOfAllSubstrings{
    private static boolean isVowel(char c){
        return c == 'a' || c== 'e' || c == 'i' ||c =='o' || c == 'u';
    }
    //Combinatorics
    private static long countVowels(String word) {
        long sum = 0;
        int n = word.length();
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);

            if(isVowel(ch)){

                sum += (long)(i + 1) * (n - i);

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String word = "aba";
        long ans = countVowels(word);
        System.out.println(ans);
    }
    
}
