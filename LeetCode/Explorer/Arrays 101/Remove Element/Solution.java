/*
아이디어:
삭제할 값이 아닌 원소만 배열 앞쪽부터 다시 덮어쓴다.
남겨야 할 원소의 개수를 반환한다.

코테 포인트:
배열에서 원소를 제자리 삭제할 때는 실제로 지우기보다 유효한 값만 앞으로 모으는 쓰기 포인터를 생각한다.
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int idx=0;
        int pos=0;
        while(pos<nums.length){
            if(nums[pos]==val)k--;
            else nums[idx++]=nums[pos];
            pos++;
        }
        return k;
    }
}
