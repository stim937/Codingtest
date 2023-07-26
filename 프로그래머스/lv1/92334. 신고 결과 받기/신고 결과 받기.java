import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> map = new HashMap<>();        
        Set<String> a = new HashSet<>();
        for(String temp : report){
            a.add(temp);
        }
        
        for(String temp : a){
            String[] arr = temp.split(" ");
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }
        
        List<String> check_user = new ArrayList<>();        
        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();           
            if (map.get(key) >= k){
                check_user.add(key);
            }
        }
        
        
        Map<String, Integer> map2 = new HashMap<>();        
        int cnt = 0;
        if(check_user.isEmpty()) {
            return answer;
        } else {
            for(String temp : a){
                String[] arr = temp.split(" ");
                for(String name : check_user){
                    if(name.equals(arr[1])) {
                        map2.put(arr[0], map2.getOrDefault(arr[0], 0) + 1);
                    }
                }                
            }  
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = 0;
            Iterator<String> keys2 = map2.keySet().iterator();
            while(keys2.hasNext()){
                String key = keys2.next();           
                if(key.equals(id_list[i])){
                    answer[i] = answer[i] + map2.get(key);
                }
            }
        }
  
        return answer;
    }
}