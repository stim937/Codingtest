import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {                       
        int answer = 0; 
        for(int i = 1; i <= number; i++){
            int cnt = 0;
            if ( i % 2 == 0){
                for(int j = 1; j <= i / 2; j++){
                    if(i % j == 0){
                    cnt++;
                    }
                }
                cnt++;
            } else {
                for(int j = 1; j <= i / 3; j++){
                    if(i % j == 0){
                        cnt++;
                    }
                }
                cnt++;
            }     
            if(cnt > limit) cnt = power;
            answer += cnt;
        }

       

        return answer;
    }
}