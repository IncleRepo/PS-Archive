# 485. Max Consecutive Ones

- 난이도: Easy
- 원문: <https://leetcode.com/problems/max-consecutive-ones/>

## 문제

`0`과 `1`로만 이루어진 이진 배열 `nums`가 주어진다.

배열에서 연속해서 등장하는 `1`의 최대 개수를 구하라.

## 예제 1

```text
입력: nums = [1,1,0,1,1,1]
출력: 3
```

마지막에 있는 `1,1,1`이 가장 긴 연속 구간이므로 정답은 3이다.

## 예제 2

```text
입력: nums = [1,0,1,1,0,1]
출력: 2
```

가장 긴 연속된 `1` 구간의 길이는 2다.

## 제약 조건

- `1 <= nums.length <= 10^5`
- `nums[i]`는 `0` 또는 `1`
