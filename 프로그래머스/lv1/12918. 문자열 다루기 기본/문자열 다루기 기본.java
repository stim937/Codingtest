class Solution {
    public boolean solution(String s) {
        boolean answer = true;       
        try{
            if(s.length() == 4 || s.length() == 6){
                int a = Integer.parseInt(s);
            } else {
                return false;
            }    
        } catch(Exception e) {
            return false;
        }
        
        return answer;
    }
}