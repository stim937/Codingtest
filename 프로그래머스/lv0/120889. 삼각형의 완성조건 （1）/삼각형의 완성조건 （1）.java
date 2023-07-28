import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int sum = 0;
        for(int i = 0; i < sides.length - 1; i++){
            sum = sum + sides[i]; 
        }
        
        if(sum > sides[2]){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}