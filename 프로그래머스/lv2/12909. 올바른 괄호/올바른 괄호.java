import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                stack.push(ch); // 여는 괄호일 경우 스택에 추가
            } else { // 닫는 괄호일 경우
                if (stack.isEmpty()) { // 스택이 비어있는 경우
                    answer = false;
                    break;
                } else {
                    stack.pop(); // 짝이 맞는 여는 괄호를 스택에서 제거
                }
            }
        }

        if (!stack.isEmpty()) { // 모든 괄호를 순회한 후에도 스택에 여는 괄호가 남아있는 경우
            answer = false;
        }

        return answer;
    }
}