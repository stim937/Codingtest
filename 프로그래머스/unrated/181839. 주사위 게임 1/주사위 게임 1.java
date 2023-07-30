class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = a + b;
        if(sum % 2 == 0){
            if(a % 2 == 0){
                answer = Math.abs(a - b);
            } else {
                answer = (a * a) + (b * b);
            }            
        } else {
            answer = 2 * (a + b);
        }
        
        return answer;
    }
}