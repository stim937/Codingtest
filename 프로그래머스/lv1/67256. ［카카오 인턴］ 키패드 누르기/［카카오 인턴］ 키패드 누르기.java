class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftCur = 10;
        int righCur = 12;
    
        for(int i = 0; i < numbers.length; i++){
            int leftdist = 0;
            int rightdist = 0;
            if(numbers[i] == 0) numbers[i] = 11;          
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 || numbers[i] == 10){
                answer += "L";
                leftCur = numbers[i];
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 || numbers[i] == 12){
                answer += "R";
                righCur = numbers[i];
            } else {
                if(numbers[i] - leftCur == 1 || Math.abs(numbers[i] - leftCur) == 3){
                    leftdist = 1;
                } else if(Math.abs(numbers[i] - leftCur) == 6) {
                    leftdist = 2;
                } else if(Math.abs(numbers[i] - leftCur) == 9) {
                    leftdist = 3;           
                } else if(numbers[i] > leftCur){
                    if(numbers[i] - leftCur == 4){
                        leftdist = 2;
                    } else if(numbers[i] - leftCur == 7){
                        leftdist = 3;
                    } else if(numbers[i] - leftCur == 10){
                        leftdist = 4;
                    }                    
                } else if(numbers[i] < leftCur){
                    if(leftCur - numbers[i] == 2){
                        leftdist = 2;
                    } else if(leftCur - numbers[i] == 5){
                        leftdist = 3;
                    } else if(leftCur - numbers[i] == 8){
                        leftdist = 4;
                    }
                }
                
                if(righCur - numbers[i] == 1 || Math.abs(numbers[i] - righCur) == 3){
                    rightdist = 1;
                } else if(Math.abs(numbers[i] - righCur) == 6) {
                    rightdist = 2;
                } else if(Math.abs(numbers[i] - righCur) == 9) {
                    rightdist = 3;           
                } else if(numbers[i] < righCur){
                    if(righCur - numbers[i] == 4){
                        rightdist = 2;
                    } else if(righCur - numbers[i] == 7){
                        rightdist = 3;
                    } else if(righCur - numbers[i] == 10){
                        rightdist = 4;
                    }                    
                } else if(numbers[i] > righCur){
                    if(numbers[i] - righCur == 2){
                        rightdist = 2;
                    } else if(numbers[i] - righCur == 5){
                        rightdist = 3;
                    } else if(numbers[i] - righCur == 8){
                        rightdist = 4;
                    }
                }
                    
                if(leftdist < rightdist){
                    answer += "L";
                    leftCur = numbers[i];
                } else if (leftdist > rightdist) {
                    answer += "R";
                    righCur = numbers[i];
                } else {
                    if (hand.equals("right")){
                        answer += "R";
                        righCur = numbers[i];
                    } else{
                        answer += "L";
                        leftCur = numbers[i];
                    }
                } 
            }
        }
        
        return answer;
    }
}