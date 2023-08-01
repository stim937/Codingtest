class Solution {
    public int solution(int balls, int share) {    
        double answer = fac(balls) / ((fac(balls - share)) * fac(share));
        answer = Math.round(answer);
        return (int)answer;
    }
    
    public double fac(int x){
        if(x <= 1){
            return 1;
        } else {
            return x * fac(x - 1);
        }
    }
}