class Solution {
    public int solution(int[] numbers, int k) {     
        int temp = 0;
        for(int i = 0; i < k - 1; i++){
            temp += 2;
            if(temp == numbers.length){
                temp = 0;
            } else if(temp > numbers.length){
                temp = 1;
            }
        }   
        int answer = numbers[temp];
        
        return answer;        
    }
}