import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger bigNumber1 = new BigInteger(a);
        BigInteger bigNumber2 = new BigInteger(b);
        
        System.out.print(bigNumber1);
        
        answer = bigNumber1.add(bigNumber2).toString();
        
        return answer;
    }
}