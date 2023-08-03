class Solution {
    public String solution(String s, int n) {
        String answer = "";
    
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp == ' ') {
                answer += temp;
            } else {
                for(int j = 0; j < n; j++){
                    if(temp == 'z'){
                        temp = 'a'; 
                    } else if(temp == 'Z') {
                        temp = 'A'; 
                    } else {
                        temp = (char)((int)temp + 1); 
                    }    
                }  
                answer += temp;
            }
        }
        return answer;
    }
}