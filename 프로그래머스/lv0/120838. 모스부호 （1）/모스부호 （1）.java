import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
                          "....","..",".---","-.-",".-..","--","-.","---",
                          ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String abc = "abcdefghijklmnopqrstuvwxyz";
        
        Map<String, String> map = new HashMap<>();
        
        for(int i = 0; i < morse.length; i++){
            map.put(morse[i], abc.substring(i, i + 1));
        }
        System.out.println(map);
        
        String[] a = letter.split(" ");
        for(int i = 0; i < a.length; i++){
            answer = answer + map.get(a[i]);
        }
        
        return answer;
    }
}