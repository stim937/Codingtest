class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            String a = s.substring(i, i + 1);
            if(a.equals("p") || a.equals("P")){
                pCnt++;
            } else if(a.equals("y") || a.equals("Y")){
                yCnt++;
            }
        }
        
        if(pCnt == yCnt) answer = true;
   
        return answer;
    }
}