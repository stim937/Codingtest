import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(String split : answer){
            if(!split.equals("")){
                list.add(split);
            }
        }
        String[] result = new String[list.size()];
        
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}