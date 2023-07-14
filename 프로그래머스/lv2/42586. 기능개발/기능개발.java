import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day;

		Queue<Integer> qu = new LinkedList<>();

		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				day = (100 - progresses[i]) / speeds[i];
			} else {
				day = ((100 - progresses[i]) / speeds[i]) + 1;
			}
			qu.offer(day);
		}

		System.out.println(qu);

		List<Integer> list = new ArrayList<>();

		int resultCount = 0;
		int max = 0;
		int temp = 0;
		while (!qu.isEmpty()) {
			temp = qu.poll();			
			if (max == 0) {
				max = temp;
				resultCount++;
				continue;
			}
			
			if (max < temp) {
				list.add(resultCount);
				max = temp;		
				resultCount = 1;
				if (qu.size() == 0) {
					list.add(resultCount);
				}
			} else {				
				resultCount++;
                if (qu.size() == 0) {
					list.add(resultCount);
				}
			}
			
			
		
		}
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		for (int i = 0 ; i < answer.length; i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
        
        return answer;
    }
}