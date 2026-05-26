/*
아이디어:
1이 나오면 현재 연속 길이를 늘리고, 0이 나오면 끊겼으니 0으로 초기화한다.
매번 최대 길이를 갱신한다.

코테 포인트:
연속 구간 문제는 "현재 길이"와 "최대 길이"를 따로 들고 가면 단순해진다.
*/
class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		int ret=0;
		int temp=0;
		int len=nums.length;
		for(int i=0;i<len;i++){
			if(nums[i]==0){
				temp=0;
				continue;
			}
			ret=Math.max(ret,++temp);
		}
		return ret;
	}
}
