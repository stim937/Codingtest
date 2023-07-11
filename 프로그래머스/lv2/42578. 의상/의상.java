import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1); 
        }
     
        int mul = 1;
        
        for(int a : map.values()) {
        	mul = mul * a;
        }
        answer = mul - 1;
        
        System.out.println(map);
        System.out.println(mul - 1);
        return answer;
    }
}