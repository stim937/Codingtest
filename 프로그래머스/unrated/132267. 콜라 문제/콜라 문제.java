class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int cnt = 0;          
            cnt += n % a;
            cnt += (n / a) * b;  
            answer += (n / a) * b;
            
            n = cnt;
            System.out.println(n);
        }
        return answer;
    }
    
}