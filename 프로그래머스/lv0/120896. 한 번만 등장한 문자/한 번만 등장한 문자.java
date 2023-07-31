import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                list.add(s.charAt(i));
            }
        }
        
        char[] charArr = new char[list.size()];
        for(int i = 0; i < charArr.length; i++){
            charArr[i] = list.get(i);
        }
        
        Arrays.sort(charArr);
        for(char chr : charArr){
            answer = answer + chr;
        }
        
        return answer;
    }
}