/*
아이디어:
정렬 배열에서는 같은 값이 연속해서 나온다.
현재 값이 같은 값 구간의 마지막 원소라면 배열 앞쪽에 차례대로 덮어쓴다.

코테 포인트:
정렬 배열의 중복 제거는 인접한 값으로 구간의 경계를 찾고, 쓰기 포인터로 유효한 값만 모은다.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i==n-1||nums[i+1]!=nums[i])
                nums[idx++]=nums[i];
        }
        return idx;
    }
}
