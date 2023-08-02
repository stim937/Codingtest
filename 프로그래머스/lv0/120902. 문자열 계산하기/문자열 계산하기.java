class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split(" ");
        boolean next = true;
        for(int i = 0; i < split.length; i++){
            if(split[i].equals("+")){
                next = true;
                continue;
            } else if(split[i].equals("-")){
                next = false;
            } else {
                if(next){
                    answer += Integer.parseInt(split[i]);
                } else {
                    answer -= Integer.parseInt(split[i]);
                }
            }
        }
        
        return answer;
    }
}