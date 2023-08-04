class Solution {
    public String solution(int[] food) {
        String answer = "";
        String temp1 = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] > 1){
                int a = food[i] / 2;
                
                for(int j = 0; j < a; j++){
                    temp1 += i;
                }
            }
        }
        
        String temp2 = "";
        for(int i = temp1.length() - 1; i >= 0; i--){
            temp2 += temp1.substring(i, i + 1);
        }
        
        answer = temp1 + "0" + temp2;
        
        return answer;
    }
}