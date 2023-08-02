import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();    
        String temp = "";
        for(int i = 0; i < my_str.length(); i += n){
            if(i + n < my_str.length()){
                temp = my_str.substring(i, i + n);
                list.add(temp);
            } else {
                temp = my_str.substring(i);
                list.add(temp);
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        return  answer;
    }
}