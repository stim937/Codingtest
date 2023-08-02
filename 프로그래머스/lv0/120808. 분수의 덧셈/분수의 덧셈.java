class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);
        int upper = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);  
        int under = lcm;
     
        answer[0] = upper / gcd(upper, under);
        answer[1] = under / gcd(upper, under);
        
        return answer;
    }
    
    public static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
}