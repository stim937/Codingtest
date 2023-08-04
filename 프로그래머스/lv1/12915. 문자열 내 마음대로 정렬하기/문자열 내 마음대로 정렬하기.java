import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {       
        List<String> list = new ArrayList<>();
      
        String newWord = "";
        for (int i = 0; i < strings.length; i++){
            newWord = strings[i].charAt(n) + strings[i];
            list.add(newWord);
        }
        
        Collections.sort(list);
        String[] answer = list.toArray(new String[list.size()]);
        for(int i = 0; i < answer.length; i++){
            answer[i] = answer[i].substring(1);
        }

        return answer;
    }
}