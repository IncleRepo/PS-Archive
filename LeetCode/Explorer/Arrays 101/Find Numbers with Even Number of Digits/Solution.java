/*
아이디어:
각 숫자의 자릿수를 구해서 짝수 자리면 개수를 센다.

코테 포인트:
배열에서 조건에 맞는 원소 개수만 필요하면 필터링하듯 한 번 순회하면 된다.
*/
class Solution {
    public int findNumbers(int[] nums) {
        int ret=0;
        for(int n:nums){
            //혹은 String.valueof(n)
            if(Integer.toString(n).length()%2!=0)continue;
            ret++;
        }
        return ret;
    }
}
