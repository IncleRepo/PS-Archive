/*
아이디어:
값 x가 등장하면 배열의 x - 1 위치를 음수로 바꿔 방문 여부를 표시한다.
모든 값을 확인한 뒤 양수로 남은 위치의 인덱스 + 1이 등장하지 않은 숫자다.

코테 포인트:
값의 범위가 1부터 배열 길이까지라면 값과 인덱스를 연결해 원본 배열을 방문 배열처럼 쓸 수 있다.
이미 음수가 된 값을 다시 읽을 수 있으므로 절댓값으로 원래 값을 복원한다.
*/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Step 1: 등장한 숫자 위치를 체크
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;  // 인덱스는 0-based
            if (nums[index] > 0) {
                nums[index] = -nums[index];  // 방문한 숫자는 음수로 변경
            }
        }

        // Step 2: 양수로 남아 있는 인덱스 + 1이 누락된 숫자
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {  // 양수라면 방문되지 않은 숫자
                result.add(i + 1);
            }
        }

        return result;
    }
}
