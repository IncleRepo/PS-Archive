# 1295. Find Numbers with Even Number of Digits

- 난이도: Easy
- 원문: <https://leetcode.com/problems/find-numbers-with-even-number-of-digits/>

## 문제

정수 배열 `nums`가 주어진다.

배열에 들어 있는 수 중에서 자릿수가 짝수 개인 수의 개수를 구하라.

## 예제 1

```text
입력: nums = [12,345,2,6,7896]
출력: 2
```

`12`는 두 자리, `7896`은 네 자리이므로 자릿수가 짝수인 수는 총 2개다.

## 예제 2

```text
입력: nums = [555,901,482,1771]
출력: 1
```

`1771`만 네 자리 수이므로 정답은 1이다.

## 제약 조건

- `1 <= nums.length <= 500`
- `1 <= nums[i] <= 10^5`
