class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long i = 0; i <= n; i++){
            if ((long)Math.pow(i, 2) == n) {
                answer = (long)Math.pow(i + 1, 2);
                break;
            } else if ((long)Math.pow(i, 2) > n){
                break;
            }
        }
        return answer;
    }
}