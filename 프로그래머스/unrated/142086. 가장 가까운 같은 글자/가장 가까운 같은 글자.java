class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            String temp = s.substring(i, i + 1);
            int count = 0;
            int lastIndex = 0;
            for(int j = 0; j <= i; j++){
                if(temp.equals(s.substring(j, j + 1))){
                    count++;
                    if(j != i){
                        lastIndex = j;
                    }                    
                }
            }
            
            if(count == 1){
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex;
            }
        }
        return answer;
    }
}