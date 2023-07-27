class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            answer = answer + my_string.substring(my_string.length() - 1 - i,
                                                  my_string.length() - i);
        }
        return answer;
    }
}