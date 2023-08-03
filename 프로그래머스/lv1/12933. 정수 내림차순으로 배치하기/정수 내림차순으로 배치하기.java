import java.util.*;
class Solution {
    public long solution(long n) {
        
        // 1의자리숫자를 리스트에 순서대로 저장
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int num = (int)(n % 10);
            list.add(num);
            n /= 10;
        }
        
        //리스트를 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        //문자열에 차례대로 더해 숫자형 문자열 생성
        String a = "";
        for(int i = 0; i < list.size(); i++){
            a += list.get(i);
        }
        
        //long형으로 변환
        long answer = Long.parseLong(a);

        return answer;
    }
}