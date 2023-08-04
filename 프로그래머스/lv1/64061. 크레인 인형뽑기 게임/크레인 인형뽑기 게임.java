import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++){
            int idx = moves[i] - 1;           
            for(int j = 0; j < board.length; j++){
                if(board[j][idx] != 0){
                    if(!stack.isEmpty() && board[j][idx] == stack.peek()){
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][idx]);
                    }
                    board[j][idx] = 0;
                    break;
                }              
            }
        }        
        System.out.print(stack);          
                   
        
        
        
        return answer;
    }
}