class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String temp = "";
        Long compareNum = Long.parseLong(p);
        for(int i = 0; i < t.length() - (p.length() - 1); i++){
            temp = t.substring(i, i + p.length());
            if(Long.parseLong(temp) <= compareNum) answer++;
        }
        return answer;
    }
}