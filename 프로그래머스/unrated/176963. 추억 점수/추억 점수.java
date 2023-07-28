import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int cnt = 0;
        int sum = 0; 
        for(String[] names : photo){
            for(String a : names){
                sum = sum + map.getOrDefault(a, 0);                
            }
            answer[cnt] = sum;
            cnt++;
            sum = 0;
        }    
        return answer;
    }
}