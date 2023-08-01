class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        String[] compare = new String[cards1.length + cards2.length];
        int cards1Index = 0;
        int cards2Index = 0;      
        int goalIndex = 0;
        for(int i = 0; i < goal.length; i++){  
            if(goal[i].equals(cards1[cards1Index])){
                cards1Index++;
                if(cards1Index == cards1.length){
                    cards1Index = 0;
                }
            } else if(goal[i].equals(cards2[cards2Index])){
                cards2Index++;
                if(cards2Index == cards2.length){
                    cards2Index = 0;
                }
            } else {
                answer = "No";
                break;
            }

        }

        return answer;
    }
}