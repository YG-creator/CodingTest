최단거리, 이전거 영향

* 1차 DP

​	dp[i] = dp[i-1] + dp[i-2]  :  15624 피보나치수 7 , 1904 01타일, 11726 2xn 타일링, 

​	dp[i] = dp[i-1] + dp[i-2] + dp[i-3] :   9095 1,2,3 더하기

​	idp[a] = dp[b] + 1 : 11053 가장 긴 증가하는 부분 수열

​	dp[i] += dp[i] + dp[i-j] : 2293 동전1

​	j는 i 이하 && dp[i] = Math.max(dp[i],dp[i-j]+arr[j] )  : 11052 카드구매하기

[	징검다리 건너기 (large) #22871](https://www.acmicpc.net/problem/22871)

[	지금길 #1446](https://www.acmicpc.net/problem/1446)	

```java
다익스트라+dp 
1. 오름차순 정렬(다익스트라)
2. dp[end] = Math.min(dp[end],dp[start] + weight)   
   dp[now+1] = Math.min(dp[now]+1,dp[now+1])
```

​	[개업 #13910](https://www.acmicpc.net/problem/13910) - 조합 + dp : nC1 or nC2  +  dp[j+k] = Math.min(dp[j+k],dp[j]+k)

[	동전 #9084](https://www.acmicpc.net/problem/9084) - dp[j+i] += dp[j]

[	BOJ 거리 #12026](https://www.acmicpc.net/problem/12026) - dp[i] = Math.min(dp[i], (int)Math.pow(i-j,2))

​	[카드 구매하기 #11052](https://www.acmicpc.net/problem/11052) - dp[i] = Math.max(dp[i],dp[i-j] + arr[j])s

​	[돌 게임 #9655](https://www.acmicpc.net/problem/9655) - dp[i+1], dp[i+3] = true

[1,2,3 더하기 #9095](https://www.acmicpc.net/problem/9095) - dp[i] = dp[i-1] + dp[i-2] + dp[i-3], 초기값 주의

[1,2,3 더하기 3 #15988](https://www.acmicpc.net/problem/15988) - dp[i] = dp[i-1] + dp[i-2] + dp[i-3], 초기값 주의, 자료형 주의

[연속합 #1912](https://www.acmicpc.net/problem/1912) - 음수 , 양수 연속구간 합

[새끼치기 #17291](https://www.acmicpc.net/problem/17291) - dp[i] = dp[i-1] * 2   /    짝수이면 dp[i] = dp[i-4] + dp[i-5]

[Four Squares #17626](https://www.acmicpc.net/problem/17626) - dp[i] = Math.min(dp[i-j*j]) + 1

[카드 구매하기 2](https://www.acmicpc.net/problem/16194) - dp[i] = Math.min(dp[i],dp[i-j] + w[j])

[포도주 시식](https://www.acmicpc.net/problem/2156) - max(dp[i-3]+w[i-1]+w[i], dp[i-2]+w[i],dp[i-1])

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

[파일 합치기 #11066](https://www.acmicpc.net/problem/11066) 

```java
dp[i][j] = Math.min(dp[i][k] + dp[k+1][j] + sum[i][j], dp[i][j])
```

[오르막 수 #11057](https://www.acmicpc.net/problem/11057) 

```java
dp[i][n] += dp[i-1][0~n]
```

[1, 2, 3 더하기 4 #15989](https://www.acmicpc.net/problem/15989) 

```java
int[][] dp = new int[10001][4];
dp[1][1] = 1; // 1
dp[2][1] = 1; // 1+1
dp[2][2] = 1; // 2
dp[3][1] = 1; // 1+1+1
dp[3][2] = 1; // 1+2
dp[3][3] = 1; // 3
for(int i=4;i<=10000;i++) {
    dp[i][1] = dp[i-1][1];
    dp[i][2] = dp[i-2][1] + dp[i-2][2];
    dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
}
```

[1, 2, 3 더하기 7 #15992](https://www.acmicpc.net/problem/15992)

```java
dp[n+1][cnt+1] += dp[n][cnt];
dp[n+2][cnt+1] += dp[n][cnt];
dp[n+3][cnt+1] += dp[n][cnt];
```

[1,2,3 더하기 6 #15991](https://www.acmicpc.net/problem/15991) - dp[i] = dp[i-2] + dp[i-4] + dp[i-6]

[목장 건설하기 #14925](https://www.acmicpc.net/problem/14925) - 최대 정사각형 길이 구하기

```java
해당 영역이 들판일 때만 Math.min(좌,위,왼쪽위 대각선) 저장
```

[1, 2, 3 더하기 8 #15993](https://www.acmicpc.net/problem/15993) 

```java
dp[i][j] += dp[i-1][1-j] + dp[i-2][1-j] + dp[i-3][1-j]
```

[1,2,3 더하기 9 #16195](https://www.acmicpc.net/problem/16195) - 숫자합 n, 더한 숫자 갯수 m개 이하 구하기

```java
dp[i][j] += dp[i-k][j-1]
```

[타일 채우기 3 #14852](https://www.acmicpc.net/problem/14852) 

```java
dp[i] = dp[i-1]*2 + dp[i-2]*3 + 2*(dp[i-3] + ... dp[i-n])

// 시관초과 -> 2*(dp[i-3] + ... dp[i-n]) -> 2차 dp로 해결
dp[i][1] = dp[i-1][1] + dp[i-3][0]
dp[i][0] = dp[i-1][0]*2 + dp[i-2][0]*3 + 2*dp[i][1]
```

[오르막수 #11057](https://www.acmicpc.net/problem/11057)

```java
dp[1][0~9] = 1;
dp[i][j] += dp[i-1][0~n];
```



* 냅색

  [동전 분배](https://www.acmicpc.net/problem/1943) - 잔돈으로 만들수 있는 돈 구하기





* 2차 dp + 구간합

[소형기관차 #2616](https://www.acmicpc.net/problem/2616) - 연속구간 cnt개 더하기 

```java
dp[cnt][i] = Math.max(dp[cnt][i-1],
                      dp[cnt-1][i-m] + sum[i] - sum[i-m]);
```



* 스냅백 (한계, 가치)

12866 평범한 배낭, 7579 앱

[안녕 #1535](https://www.acmicpc.net/problem/1535) - 체력(한계), 기쁨(가치)

* 3차 dp - 2602 돌다리 건너기

  [진우의 달 여행 #17485](https://www.acmicpc.net/problem/17485) - 방향, x좌표, y좌표

  [불장난 #14945](https://www.acmicpc.net/problem/14945) - 층, a위치, b위치 +  아래, 오른쪽 대각선 이동가능 

  [진우의 달 여행 (Small) #17484](https://www.acmicpc.net/problem/17484)  - x,y,방향 + 연속같은 방향 ㄴ

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

​	9251 LCS, 

[	공통 부분 문자열 #5582](https://www.acmicpc.net/problem/5582)

​	[LCS 3 #1958](https://www.acmicpc.net/problem/1958) - 3개 LCS

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

[양팔저울 #2629](https://www.acmicpc.net/problem/2629) - 완전탐색(그대로,더하기,빼기) + dp(중복처리(idx, num))

[관악산 등산 #14699](https://www.acmicpc.net/problem/14699) - 시작점 자유 + 높은데만 등산하기 + 최댓값

[수확 #1823](https://www.acmicpc.net/problem/1823) - dp(시작점, 끝점) + dfs(1~n개)

* DP + 이분탐색

12015 가장 긴 증가하는 수열



* dp + 그리디

  [커플 만들기 #1727](https://www.acmicpc.net/problem/1727) - 남자여자 성격차 합 최소 커플들 만들기

# 주의점

n 이 3자리수면 array 가능 

나머지 연산 dp 값 넣을 때마다

