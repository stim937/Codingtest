class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = temp + x;
            temp = temp + x;
        }
        
        return answer;
    }
}