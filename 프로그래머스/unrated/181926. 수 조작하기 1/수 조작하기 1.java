class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++){
            if(control.substring(i,i+1).equals("w")){
                n = n + 1;
            } else if (control.substring(i,i+1).equals("s")){
                n = n - 1;
            } else if (control.substring(i,i+1).equals("d")){
                n = n + 10;
            } else {
                n = n - 10;
            }
        }
        
        answer = n;
        return answer;
    }
}