class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int a : arr){
            sum = sum + a;
        }
        
        answer = (double)sum / (double)arr.length;
        
        return answer;
    }
}