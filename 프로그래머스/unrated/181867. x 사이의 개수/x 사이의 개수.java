import java.util.*;
class Solution {
    public int[] solution(String myString) {
        if(myString.substring(myString.length() - 1).equals("x")){
            myString += " ";            
        }
        
        String[] split = myString.split("x");       
        
        int[] answer = new int[split.length];
        for(int i = 0; i < answer.length; i++){
            if(split[i].equals(" ")){
                answer[i] = 0; 
            } else {
                answer[i] = split[i].length();
            }
       
        }
        
        return answer;
    }
}