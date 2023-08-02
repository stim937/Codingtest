class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String text = "";
        for(int i = 0; i < s.length(); i++){
            text = s.substring(i, i + 1);
            cnt++;
            if(text.equals(" ")){
                cnt = 0;
                answer += text;
            } else {
                if(cnt % 2 != 0){
                    answer += text.toUpperCase();  
                } else {
                    answer += text.toLowerCase();
                }
            }
        }
        return answer;
    }
}