class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int unknownCnt = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0) {
                unknownCnt++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]) {
                    cnt++;
                } 
            }
        }
        int max = cnt + unknownCnt;
        int min = cnt;
        
        answer[0] = rank(max);
        answer[1] = rank(min);

        return answer;
    }
    
    
    public int rank(int x) {
        if(x == 6){
            return 1;
        } else if(x == 5){
            return 2;
        } else if(x == 4){
            return 3;
        } else if(x == 3){
            return 4;
        } else if(x == 2){
            return 5;
        }
        return 6;
    }
}