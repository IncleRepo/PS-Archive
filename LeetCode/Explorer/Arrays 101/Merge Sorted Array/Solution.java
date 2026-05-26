/*
아이디어:
두 배열의 뒤쪽 큰 값부터 비교해서 nums1의 끝부터 채운다.
nums1 앞쪽 값을 덮어쓰지 않기 위해 뒤에서 병합한다.

코테 포인트:
정렬 배열 병합에서 뒤에 빈 공간이 있으면 끝에서부터 채우는 걸 먼저 생각한다.
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1;
        int r=n-1;
        int idx=m+n-1;
        
        while(l>=0&&r>=0){
            nums1[idx]=Math.max(nums1[l],nums2[r]);
            if(nums1[idx]==nums1[l])l--;
            else r--;
            idx--;
        }
        
        while(r>=0)
            nums1[idx--]=nums2[r--];
        
    }
}
