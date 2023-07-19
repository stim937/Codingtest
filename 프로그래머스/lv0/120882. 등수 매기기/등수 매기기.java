import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        Arrays.fill(answer, 1);
        // for(int a : answer){
        //     System.out.println(a);
        // }
        
        // int[] avg = new int[score.length];       
        // for(int i = 0; i < score.length; i++){
        //     avg[i] = (score[i][0] + score[i][1]) / 2;
        //     // System.out.println(avg[i]);         
        // }
        
 
        for(int i = 0; i < score.length; i++){           
            for(int j = 0; j < score.length; j++){
                if(score[i][0] + score[i][1] < score[j][0] + score[j][1]) answer[i]++;
            }       
        }
            
        for(int a : answer){
             System.out.println(a);
        }
        
        return answer;
    }
}