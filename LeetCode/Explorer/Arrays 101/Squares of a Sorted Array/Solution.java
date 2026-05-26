/*
아이디어:
정렬 배열에서 제곱값의 최댓값은 양끝 중 하나에서 나온다.
양끝을 비교해서 큰 값부터 뒤에서 채운다.

코테 포인트:
정렬 배열에 음수가 섞이면, 값 자체보다 절댓값 기준으로 양끝 비교를 의심한다.
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] ret=new int[nums.length];
      int left=0;
      int right=nums.length-1;
      int idx=right;
      while(idx>=0){
          int lvalue=nums[left]*nums[left];
          int rvalue=nums[right]*nums[right];
          ret[idx]=Math.max(lvalue,rvalue);
          if(ret[idx]==lvalue)left++;
          else right--;
          idx--;
      }
     return ret;
    }
}
