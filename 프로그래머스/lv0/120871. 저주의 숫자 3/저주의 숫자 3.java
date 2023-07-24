class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i < n; i++){
            answer++;            
            if(answer % 3 == 0){
                answer++;
            } 
            
            String stringNumber = Integer.toString(answer);
            while(stringNumber.contains("3")){
                System.out.println(stringNumber);
                answer++;
                stringNumber = Integer.toString(answer);
            }
            
            if(answer % 3 == 0){
                answer++;
            }                      
        }      
        return answer;
    }
}