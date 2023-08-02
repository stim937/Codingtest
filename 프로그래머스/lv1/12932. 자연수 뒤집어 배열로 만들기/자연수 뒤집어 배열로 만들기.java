class Solution {
    public int[] solution(long n) {        
        String numbers = Long.toString(n);
        int[] answer = new int[numbers.length()];
        
        for(int i = 0; i < answer.length; i++){
            int InsertNumber = 
                Integer.parseInt(numbers.substring(numbers.length() - 1 - i, numbers.length() - i));           
            answer[i] = InsertNumber;            
        }
        return answer;
    }
}