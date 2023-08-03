import java.util.*;
class Solution {
    public String solution(String X, String Y) {
//         String[] arr_x = X.split("");
//         List<String> list_Y = new ArrayList<>();
//         for(int i = 0; i < Y.length(); i++){
//             String temp = Y.substring(i, i + 1);
//             list_Y.add(temp);
//         }
 
//         List<String> ResultList = new ArrayList<>();
//         for(int i = 0; i < arr_x.length; i++){
//             for(int j = 0; j < list_Y.size(); j++){
//                 if(arr_x[i].equals(list_Y.get(j))) {
//                     ResultList.add(list_Y.get(j));
//                     list_Y.remove(j);
//                     break;
//                 }
//             }
//         }
//         Collections.sort(ResultList, Collections.reverseOrder());
  
        
//         StringBuilder answer = new StringBuilder();
//         if(ResultList.size() == 0){
//             answer.append("-1");
//         } else {
//             String a = "only zero";
//             for(int i = 0; i < ResultList.size(); i++){
//                 if(!ResultList.get(i).equals("0")) {
//                     a = "not only zero";
//                     break;
//                 }
//             }

//             if(a.equals("not only zero")){
//                 for(int i = 0; i < ResultList.size(); i++){
//                     answer.append(ResultList.get(i));
//                 }
//             } else {
//                  answer.append("0");
//             }    
//         }  
        
        StringBuilder answer = new StringBuilder();
        int[] arr_x = new int[10];
        int[] arr_y = new int[10];
        
        for(String x : X.split("")){
            arr_x[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            arr_y[Integer.parseInt(y)]++;
        }
        
        for(int i = 9; i >= 0; i--){
            while(arr_x[i] > 0 && arr_y[i] > 0){
                answer.append(i);
                arr_x[i]--;
                arr_y[i]--;
            }
        }
        
        if(answer.toString().equals("")) return "-1";
        if(answer.toString().substring(0,1).equals("0")) return "0";
        
        
        return answer.toString();
    }
}