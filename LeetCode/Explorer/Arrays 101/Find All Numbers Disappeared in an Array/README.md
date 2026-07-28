# 448. Find All Numbers Disappeared in an Array

- 난이도: Easy
- 원문: <https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/>

## 문제

길이가 `n`인 정수 배열 `nums`가 주어지며, 모든 원소는 `1`부터 `n` 사이의 값이다.

`1`부터 `n`까지의 정수 중에서 `nums`에 등장하지 않는 모든 값을 배열로 반환하라.

## 예제 1

```text
입력: nums = [4,3,2,7,8,2,3,1]
출력: [5,6]
```

`1`부터 `8`까지의 값 중 `5`와 `6`만 배열에 등장하지 않는다.

## 예제 2

```text
입력: nums = [1,1]
출력: [2]
```

`1`부터 `2`까지의 값 중 `2`가 등장하지 않는다.

## 제약 조건

- `n == nums.length`
- `1 <= n <= 10^5`
- `1 <= nums[i] <= n`

## 추가 조건

반환할 배열을 제외한 추가 공간 없이 `O(n)` 시간에 해결할 수 있는지도 생각해보라.
