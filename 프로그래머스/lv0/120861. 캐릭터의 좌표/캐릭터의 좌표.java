class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
             
        int max_x = (board[0] - 1) / 2;
        int min_x = -max_x;
        
        int max_y = (board[1] - 1) / 2;
        int min_y = -max_y;
        
        System.out.println(min_y);
        for(String direction : keyinput){
            if(direction.equals("left") && answer[0] != min_x){
                answer[0] = answer[0] - 1; 
            } else if(direction.equals("right") && answer[0] != max_x){
                answer[0] = answer[0] + 1;  
            } else if(direction.equals("up") && answer[1] != max_y){
                answer[1] = answer[1] + 1; 
            } else if(direction.equals("down") && answer[1] != min_y) {
                answer[1] = answer[1] - 1;                  
            }
 
            
        }
        return answer;
    }
}