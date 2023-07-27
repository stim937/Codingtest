class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] a = {"a", "e", "i", "o", "u"};
        
        for(String temp : a){
            my_string = my_string.replace(temp, "");
        }
        answer = my_string;
        return answer;
    }
}