# 1346. Check If N and Its Double Exist

- 난이도: Easy
- 원문: <https://leetcode.com/problems/check-if-n-and-its-double-exist/>

## 문제

정수 배열 `arr`가 주어진다.

서로 다른 두 인덱스 `i`, `j` 중에서 `arr[i] == 2 * arr[j]`를 만족하는 경우가 있는지 확인하라.

조건을 만족하는 두 원소가 있으면 `true`, 없으면 `false`를 반환한다.

## 예제 1

```text
입력: arr = [10,2,5,3]
출력: true
```

`10`은 `5`의 두 배이므로 조건을 만족한다.

## 예제 2

```text
입력: arr = [3,1,7,11]
출력: false
```

서로 두 배 관계인 원소가 없다.

## 제약 조건

- `2 <= arr.length <= 500`
- `-10^3 <= arr[i] <= 10^3`
