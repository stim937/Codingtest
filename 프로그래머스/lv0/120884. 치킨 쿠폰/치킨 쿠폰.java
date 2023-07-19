class Solution {
    public int solution(int chicken) {
        int answer = -1;
        
        int service = 0;
        for(int i = 1; i <= chicken ; i++){
            if(i % 10 == 0){
                service++;
                chicken++;
            }

        } 
        System.out.println(service);
        System.out.println(chicken);

        answer = service;
        return answer;
    }
}