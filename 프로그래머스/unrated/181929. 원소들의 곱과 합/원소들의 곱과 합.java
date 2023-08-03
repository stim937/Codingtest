class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;        
        for(int num : num_list){
            a *= num;
            b += num;
        }
        
        if(a > Math.pow(b, 2)){
            answer = 0;
        } else if(a < Math.pow(b, 2)){
            answer = 1;
        }
        
        return answer;
    }
}