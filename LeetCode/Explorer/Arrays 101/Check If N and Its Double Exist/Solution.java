/*
아이디어:
지금까지 본 값을 집합에 저장한다.
현재 값의 두 배나, 현재 값이 짝수일 때 그 절반이 집합에 있으면 조건을 만족한다.

코테 포인트:
서로 다른 두 원소의 관계를 찾을 때 한쪽 값을 저장하면서 필요한 짝을 조회하면 한 번 순회로 줄일 수 있다.
*/
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i:arr){
            if(set.contains(i*2)||(i%2==0&&set.contains(i/2)))
                return true;
            set.add(i);
        }
        return false;
    }
}
