/*
아이디어:
0이 아닌 값을 기존 순서대로 배열 앞쪽에 덮어쓴다.
모든 값을 모은 뒤 남은 위치를 0으로 채운다.

코테 포인트:
특정 값을 뒤로 보내면서 나머지 순서를 유지하려면, 쓰기 포인터로 유효한 값부터 압축한 뒤 빈 구간을 채운다.
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[idx++]=nums[i];
            }
        }
        while(idx<n)
            nums[idx++]=0;
    }
}
