class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String StringK = Integer.toString(k);         
        for(int a = i; a <= j; a++){
            String stringNumber = Integer.toString(a);
            
            if(stringNumber.length() > 1) {
                for(int b = 0; b < stringNumber.length(); b++){
                    if(stringNumber.charAt(b) == StringK.charAt(0)) {
                        answer++;
                    }  
                }
            } else {
                if(stringNumber.contains(StringK)) {
                    answer++;
                }     
            }        
        }
        return answer;
    }
}