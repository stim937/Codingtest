import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] temp = new Integer[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            temp[i] = emergency[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());

        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp.length; j++){
                if(emergency[i] == temp[j]){
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}