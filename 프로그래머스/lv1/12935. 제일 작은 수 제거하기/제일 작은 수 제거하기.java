import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1}; 
            return answer;
        } else {       
            int min = 10000000;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }           
            }
            
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != min){
                    list.add(arr[i]); 
                }
            }
            
            int[] answer = new int[arr.length - 1];
            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }   
            return answer;
        }    
    }
}