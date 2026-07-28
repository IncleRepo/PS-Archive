/*
아이디어:
원본 배열을 복제해서 정렬한 뒤, 원본과 같은 위치의 값을 하나씩 비교한다.
값이 다른 위치의 개수를 센다.

코테 포인트:
현재 상태가 정렬된 상태와 얼마나 다른지 묻는 문제는 원본을 보존하고 정렬한 복사본을 기준으로 비교한다.
*/
import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] arr=heights.clone();
        Arrays.sort(arr);
        int ret=0;
        for(int i=0;i<n;i++)
            if(arr[i]!=heights[i])ret++;
        return ret;
    }
}
