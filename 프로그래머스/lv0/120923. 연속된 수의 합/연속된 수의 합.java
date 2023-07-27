class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
            
        if(total == 0){
            int a = num / 2;   
            int cnt = 0;
            for (int i = 0; i < answer.length; i++){             
                   answer[i] = cnt - a;
                   cnt++;
               }
            return answer;
        }
        
        int temp = total;
        int cnt = 1;        
       
        int b = total;
        int c = total;
        while(true){            
            while(true){
                c = c - temp;
                if(cnt == num) break;
                temp--;
                cnt++; 
            }            
            if(c == 0) {
               for (int i = 0; i < answer.length; i++){
                   answer[i] = temp;
                   temp++;
               } 
               break;   
            }        
            temp = b - 1;
            b = temp;
            c = total;
            cnt = 1;
        }
        
        
        
            
        return answer;            
    }
  
}