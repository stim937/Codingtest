class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            while(true){
                answer = answer + my_string.charAt(i);
                cnt++;
                if(cnt == n) break;
            }
            cnt = 0;
        }
        return answer;
    }
}