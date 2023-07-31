class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
        for(long i = 1; i <= count; i++){
            result = result + (price * i);
        }
        
        if(result > money){
            answer = result - money;
        }

        return answer;
    }
}