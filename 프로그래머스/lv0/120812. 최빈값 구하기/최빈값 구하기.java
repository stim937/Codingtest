import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);       
        }
        
        int maxValue = 0;
        for(int i = 0; i < array.length; i++){
            if(answer != array[i]){
                if(map.get(array[i]) > maxValue){
                    answer = array[i];
                    maxValue = map.get(array[i]);
                } else if (map.get(array[i]) == maxValue){
                    answer = -1;
                }
            }            
        }
        return answer;
    }
}