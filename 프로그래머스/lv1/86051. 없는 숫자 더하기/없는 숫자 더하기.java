class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String temp = "0123456789";
        for(int num : numbers){
            temp = temp.replace(Integer.toString(num), "");             
        }
        System.out.print(temp);
        for(int i = 0; i < temp.length(); i++){
            answer = answer + Integer.parseInt(temp.substring(i, i + 1));          
        }
        
        return answer;
    }
}