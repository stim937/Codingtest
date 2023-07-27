class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int temp = 0;
        while(true){
            temp = slice * answer;
            System.out.println(slice);
            if(temp >= n) return answer;          
            answer++;
        }
    }
}