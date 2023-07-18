class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int max_x = -256;
        int max_y = -256;
        
        int min_x = 256;
        int min_y = 256;
        for (int[] dot : dots){
            if(dot[0] > max_x) max_x = dot[0];
            if(dot[0] < min_x) min_x = dot[0];
            
            if(dot[1] > max_y) max_y = dot[1];
            if(dot[1] < min_y) min_y = dot[1];
        }
        
        answer = (max_x - min_x) * (max_y - min_y);
        return answer;
    }
}