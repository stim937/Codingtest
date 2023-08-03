class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int right = 0;
        int left = 0;
        int up = 0;
        int down = 0;
        
        String cur = "right";
        int loc_x = 0;
        int loc_y = 0;
        for(int i = 1; i <= Math.pow(n, 2); i++){
            if(cur.equals("right")){
                answer[loc_y][loc_x] = i;
                loc_x++;
                if(loc_x == n || answer[loc_y][loc_x] != 0){
                    loc_y++;
                    loc_x--;
                    cur = "down";
                }
            } else if(cur.equals("down")){
                answer[loc_y][loc_x] = i;
                loc_y++;
                if(loc_y == n || answer[loc_y][loc_x] != 0){
                    loc_x--;
                    loc_y--;
                    cur = "left";
                } 
            } else if(cur.equals("left")){
                answer[loc_y][loc_x] = i;
                loc_x--;
                if(loc_x == -1 || answer[loc_y][loc_x] != 0){
                    loc_y--;
                    loc_x++;
                    cur = "up";
                }      
            } else if(cur.equals("up")){
                answer[loc_y][loc_x] = i;
                loc_y--;
                if(loc_y == -1 || answer[loc_y][loc_x] != 0){
                    loc_x++;
                    loc_y++;
                    cur = "right";
                } 
            }
        }
        
        return answer;
    }
}