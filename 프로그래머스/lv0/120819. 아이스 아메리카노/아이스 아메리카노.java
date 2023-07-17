class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano = 5500;
        int a = money % americano;
        if(a == 0){
            answer[0] = money / americano;
            answer[1] = 0;
        } else {
            answer[0] = money / americano;
            answer[1] = money - (answer[0] * americano);
        }

        return answer;
    }
}