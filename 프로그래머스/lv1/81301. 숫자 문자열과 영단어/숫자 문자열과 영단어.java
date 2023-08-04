class Solution {
    public int solution(String s) {     
        String[] abc = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0 ; i < abc.length; i++){
            if(s.contains(abc[i])){
                s = s.replace(abc[i], num[i]);
            }
        }
        
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}