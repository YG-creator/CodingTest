* 1차 DP

dp[i] = dp[i-1] + dp[i-2]  :  15624 피보나치수 7 , 1904 01타일, 11726 2xn 타일링, 

dp[i] = dp[i-1] + dp[i-2] + dp[i-3] :   9095 1,2,3 더하기

idp[a] = dp[b] + 1 : 11053 가장 긴 증가하는 부분 수열

dp[i] += dp[i] + dp[i-j] : 2293 동전1

j는 i 이하 && dp[i] = Math.max(dp[i],dp[i-j]+arr[j] )  : 11052 카드구매하기

[징검다리 건너기 (large) #22871](https://www.acmicpc.net/problem/22871)

[지금길 #1446](https://www.acmicpc.net/problem/1446)

```java
다익스트라+dp 
1. 오름차순 정렬(다익스트라)
2. dp[end] = Math.min(dp[end],dp[start] + weight)   
   dp[now+1] = Math.min(dp[now]+1,dp[now+1])
```

[개업 #13910](https://www.acmicpc.net/problem/13910) - 조합 + dp : nC1 or nC2  +  dp[j+k] = Math.min(dp[j+k],dp[j]+k)

[동전 #9084](https://www.acmicpc.net/problem/9084) - dp[j+i] += dp[j]

[BOJ 거리 #12026](https://www.acmicpc.net/problem/12026) - dp[i] = Math.min(dp[i], (int)Math.pow(i-j,2))

* LIS

​	[민균이의 계략 #11568](https://www.acmicpc.net/problem/11568)



* 2차 DP : 

[쉬운 계단 수 #10844](https://www.acmicpc.net/problem/10844) 

```
dp[i+1][j] = dp[i][j-1] + dp[i][j+1]
```

1149 RGB 거리

[1학년 #5557](https://www.acmicpc.net/problem/5557)

[자원 캐기 #14430](https://www.acmicpc.net/problem/14430)- 오른쪽, 아래쪽 이동만 가능 최댓값 구하기

[격자상의 경로 #10164](https://www.acmicpc.net/problem/10164) 

```
dp[n][m] = dp[n-1]+dp[m-1]
```

[이동하기 #11048](https://www.acmicpc.net/problem/11048)

```java
0행, 0열 setting 후
dp[i][j] = Math.max(Math.max(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]) + graph[i][j];
```

[리조트 #13302](https://www.acmicpc.net/problem/13302) - 날짜, 쿠폰



* 스냅백 (한계, 가치)

12866 평범한 배낭, 7579 앱



* 3차 dp - 2602 돌다리 건너기

  [진우의 달 여행 #17485](https://www.acmicpc.net/problem/17485) - 방향, x좌표, y좌표

  

* 4차 dp

​	[출근 경로 #5569](https://www.acmicpc.net/problem/5569)



* LCS

```java
if(a.charAt(i-1) == b.charAt(j-1)) {
	LCS[i][j] = LCS[i-1][j-1] + 1;
} else {
	LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
}
```

9251 LCS, 



* 팰린드롬 - 대칭수

```
1 글자 - 무조건 대칭
2 글자 - 두글자가 같아야 대칭
3 글자 이상 - 맨처음과 맨끝이 같고 그사이에 있는 수가 대칭수이면 대칭
```

10942 팰린드롬?



*  DP + DFS(그래프)

1520 내리막 길

```java
// 방문처리
//처음에 Top-Down 방식으로 수정하면서, 따로 visited 배열을 만들지 않고 dp배열의 0값을 미방문으로 인식하고 구현했다.
//그러나 0일 경우에, 연결이 도착점과 연결이 안된 것인지 탐색을 안한것인지 구별하지못해 탐색을 했음에도 도착점과 연결이 안된 경로를 재탐색하기 때문에 시간초과가 난다.
//결론적으로 다시 visited 배열로 방문을 체크를 했다.
```

14699 관악산 등반

```java
//시간초과가 떴음
//dp + DFS
//가장 높은 높이부터 내림차순으로 dp[i] = dp[j] + 1; // j는 i와 연결된 쉼터
```

1937 욕심쟁 판다

[배열 탈출 #11909](https://www.acmicpc.net/problem/11909) - dp + 그래프 + 대소비교

* DP + 이분탐색

12015 가장 긴 증가하는 수열



# 주의점

n 이 3자리수면 array 가능 

나머지 연산 dp 값 넣을 때마다

