import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
		    
		int temp = 0;
		for (int a : arr){
		    if (!st.isEmpty()) {
		        temp = st.pop();
		        if(a == temp){
		            st.push(temp);
		        } else {
		            st.push(temp);
		            st.push(a);
		        }                
		    } else {
		    	 st.push(a);
		    }
        }
		int[] answer = new int[st.size()];
	    for(int i = st.size() - 1; i >=0 ; i--) {
	    	answer[i] = st.pop();	
        }

        return answer;
    }
}