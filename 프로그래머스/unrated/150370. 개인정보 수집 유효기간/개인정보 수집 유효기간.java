import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {       
        Map<String, Integer> map = new HashMap<>();       
        for(int i = 0; i < terms.length; i++){
            String[] temp1 = terms[i].split(" ");           
            map.put(temp1[0], Integer.parseInt(temp1[1]));
        }
        
        List<Integer> list = new ArrayList<>();               
        int todayYear = Integer.parseInt(today.substring(0,4));
        int todayMonth = Integer.parseInt(today.substring(5,7));
        int todayDay = Integer.parseInt(today.substring(8));
        for(int i = 0; i < privacies.length; i++){
            String[] temp2 = privacies[i].split(" ");
            
            int year = Integer.parseInt(temp2[0].substring(0,4));
            int month = Integer.parseInt(temp2[0].substring(5,7));
            int day = Integer.parseInt(temp2[0].substring(8));

            for(int j = 1; j < map.get(temp2[1]) * 28; j++){
                day++;
                if(day == 29){
                    month++;
                    day = 1;
                }
                
                if(month == 13){
                    year++;
                    month = 1;
                }              
            }
            
            if(todayYear > year){
                list.add(i + 1);
            } else if(todayYear == year){
                if(todayMonth > month){
                    list.add(i + 1); 
                } else if(todayMonth == month){
                    if(todayDay > day){
                        list.add(i + 1); 
                    }
                }
            }                  
        }
     
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        } 

        return answer;
    }
}