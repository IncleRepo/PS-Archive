/*
아이디어:
집합에 서로 다른 상위 3개 값만 유지한다.
집합이 가득 찬 뒤 더 큰 값이 나오면 현재 최솟값을 제거하고 새 값을 넣는다.

코테 포인트:
고정된 k번째 최댓값은 후보를 k개만 유지하면서 한 번 순회할 수 있다.
중복을 제외해야 하면 집합으로 후보를 관리한다.
*/
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> rank=new HashSet<>();
        for(var i:nums){
            if(rank.size()<3||rank.contains(i)){
                rank.add(i);
                continue;
            }
            int min=Collections.min(rank);
            if(min<i){
                rank.remove(min);
                rank.add(i);
            }
        }
        if(rank.size()<3)return Collections.max(rank);
        return Collections.min(rank);
    }
}
