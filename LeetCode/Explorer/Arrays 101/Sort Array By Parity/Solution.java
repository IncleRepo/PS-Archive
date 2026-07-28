/*
아이디어:
짝수가 들어갈 다음 위치를 가리키는 포인터를 둔다.
배열을 순회하며 짝수를 찾을 때마다 그 위치의 값과 교환한다.

코테 포인트:
두 종류의 값을 한쪽씩 모으고 내부 순서가 중요하지 않으면 교환을 이용한 제자리 파티션을 생각한다.
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
               int tmp=nums[even];
               nums[even++]=nums[i];
               nums[i]=tmp;
           }
        }
        return nums;
    }
}
