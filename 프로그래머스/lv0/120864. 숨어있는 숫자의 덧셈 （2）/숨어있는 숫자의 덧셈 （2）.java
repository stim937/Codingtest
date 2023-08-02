import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]"," ");
        String[] a = my_string.split(" ");       
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals(" ") && !a[i].equals("")){
                answer += Integer.parseInt(a[i]);
            }
        }

        return answer;
    }
}