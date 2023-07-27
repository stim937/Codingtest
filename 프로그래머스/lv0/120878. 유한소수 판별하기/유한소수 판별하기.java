import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        int max = 0;              
        for(int i = 1; i < b; i++){
            if(a % i == 0 && b % i == 0){
                max = i;
            }            
        }
        
        
        int denominator = b / max; 
        System.out.println("분모" + denominator);
        
        while(true){
            if(denominator % 2 == 0) denominator = denominator / 2;
            if(denominator % 5 == 0) denominator = denominator / 5;
           
            System.out.println(denominator);
            if(denominator == 1) return answer; 
            if(denominator % 2 != 0 && denominator % 5 != 0) break;
        }         
        return answer = 2;
    }
}