class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int a : num_list){
            if(a % 2 == 0){
                answer[0] = answer[0] + 1; 
            } else {
                answer[1] = answer[1] + 1; 
            }
        }
        return answer;
    }
}