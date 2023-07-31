import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        char[] charArr = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            charArr[i] = my_string.charAt(i);
        }
        Arrays.sort(charArr);
        for(int i = 0; i < charArr.length; i++){
            answer = answer + charArr[i];
        }
        
        return answer;
    }
}