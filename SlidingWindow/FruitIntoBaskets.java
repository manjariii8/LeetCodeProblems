import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    private static int totalFruit(int[] fruits) {
        int maxLen = 0;
        Map<Integer,Integer> basket = new HashMap<>();
        int left = 0;
        for(int right = 0; right < fruits.length;right++){
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while(basket.size() > 2){
                int fruitCnt = basket.get(fruits[left]);
                if(fruitCnt == 1){
                    basket.remove(fruits[left]);
                }
                else{
                    basket.put(fruits[left], fruitCnt - 1);
                }
                left++;
                
            }
            
            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        int ans = totalFruit(fruits);
        System.out.println(ans);

    }
}
