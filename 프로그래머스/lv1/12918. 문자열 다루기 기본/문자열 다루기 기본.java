class Solution {
    public boolean solution(String s) {
        boolean answer = true;       
        // 예외처리 활용 풀이
        // try{
        //     if(s.length() == 4 || s.length() == 6){
        //         int a = Integer.parseInt(s);
        //     } else {
        //         return false;
        //     }    
        // } catch(Exception e) {
        //     return false;
        // }
        
        // 정규식 활용 풀이
        if(s.length() != 4 && s.length() != 6) answer = false;
        s = s.replaceAll("[0-9]", "");
        if(s.length() != 0) answer = false;
  
        return answer;
    }
}