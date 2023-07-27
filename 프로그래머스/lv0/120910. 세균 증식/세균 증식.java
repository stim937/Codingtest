class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int cnt = 0;
        while(true){
            if(t == cnt) return answer;
            answer = answer * 2;
            cnt++;
        }
    }
}