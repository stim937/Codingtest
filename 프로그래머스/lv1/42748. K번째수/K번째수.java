import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
List<Integer> a = new ArrayList<>();

		int start = 0;
		int end = 0;
		int select = 0;

		for (int i = 0; i < commands.length; i++) {
			start = commands[i][0] - 1;
			end = commands[i][1] - 1;
			select = commands[i][2] - 1;

			int[] tempArr = new int[end - start + 1];

			for (int j = 0; j < tempArr.length; j++) {
				tempArr[j] = array[start + j];
			}

			Arrays.sort(tempArr);
			int result = tempArr[select];

			a.add(result);
		}

		int[] answer = new int[a.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = a.get(i);
		}
		return answer;
    }
}