class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int a : box){
            answer = answer * (int)(a / n);
        }
        return answer;
    }
}