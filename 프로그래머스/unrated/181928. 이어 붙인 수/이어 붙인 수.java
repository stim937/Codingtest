class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int num : num_list){
            if(num % 2 == 0){
                a = a + String.valueOf(num);
            } else {
                b = b + String.valueOf(num);
            }
        }
        
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        
        answer = a2 + b2;
        
        
        return answer;
    }
}