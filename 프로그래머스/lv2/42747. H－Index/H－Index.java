import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
       
        int overCount = 0;
        int underCount = 0;
        int temp = 0;
        for(int i = 0; i < citations.length; i++){
            for(int j = 0; j < citations.length; j++){
               if(citations[i] <= citations[j]){
                   overCount++;
               } else{
                   underCount++;
               }               
            }        
            System.out.println("오버" + overCount);
            System.out.println("언더" + underCount);
            System.out.println("H-INDEX 후보 " + citations[i]);
            
            if(citations[i] < overCount){
                temp = citations[i];
            } else {
                temp = overCount;
            }
            
            
            if (citations[i] != 0 && overCount >= underCount && answer <= temp){
                answer = temp;
            }
            System.out.println("H-INDEX " + answer);
            System.out.println();
         
            overCount = 0;
            underCount = 0;
        }

        return answer;
    }
}