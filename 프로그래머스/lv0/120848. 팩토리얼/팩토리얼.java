class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;
        while(true){
            answer++;
            temp = temp * answer; 
            if(temp == n) break;
            if(temp > n) {
                answer--;
                break;
            }
        }
        
        return answer;
    }
}