/*
아이디어:
1. 올라갈 수 있을 만큼 올라감
2. peak가 처음이나 끝이면 false
3. 내려갈 수 있을 만큼 내려감
4. 끝까지 갔으면 true

코테 포인트:
증가 후 감소하는 배열은 한 방향으로 이동하면서 정상의 위치와 마지막 도달 여부를 확인한다.
등호를 허용하지 않는 엄격한 증가와 감소인지도 확인해야 한다.
*/
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) i++;

        if (i == 0 || i == n - 1) return false;

        while (i + 1 < n && arr[i] > arr[i + 1]) i++;

        return i == n - 1;
    }
}
