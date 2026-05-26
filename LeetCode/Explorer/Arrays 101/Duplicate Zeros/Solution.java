/*
아이디어:
0의 개수만큼 각 값의 최종 위치가 오른쪽으로 밀린다.
뒤에서부터 보면서, 밀린 위치가 배열 안이면 그 자리에 값을 넣는다.

코테 포인트:
제자리에서 값을 밀어야 하면 앞에서부터 쓰지 말고 뒤에서부터 채우는 걸 먼저 의심한다.
*/
class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length-1;
        int zc=0;
        
        for(int i:arr)if(i==0)zc++;
        
        for(int j=n;j>=0;j--){
            if(arr[j]==0)zc--;
            int temp=arr[j];
            arr[j]=0;
            if(j+zc<arr.length)arr[j+zc]=temp;
        } 
    }
}
