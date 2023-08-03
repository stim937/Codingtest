class Solution {
    public int solution(int num) {
        int answer = 0;      
        if(num == 1) return answer;
        
        long temp = (long)num;
        while(true){          
            if(temp % 2 == 0){
                temp = temp / 2;
            } else {
                temp = (temp * 3) + 1;
            }     
            answer++;
            
            if(temp == 1) break;
            if(answer == 500) return -1;        
        }
   
        return answer;
    }
}