# BFS 

큐, 범위, 중복, 조건

덩어리 갯수, 최단거리

```java
public void dfs(int v, List<Integer>[] graph, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int i : graph[v]) {
			if(!visited[i])
				dfs(i,graph,visited);
		}
	}
	
	public void bfs(int v, List<Integer>[] graph, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visited[v] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			
			for(int i : graph[x]) {
				if(!visited[i]) {
					q.add(i);
					visited[i] = true;
				}				
			}
		}
	}
	// add 할때 횟수 세라
```



## 문제

* 기본 구현 - 1260 DFS와 BFS

* 연결된 그래프 이동 - 2606 바이러스, [등수 찾기 #17616](https://www.acmicpc.net/problem/17616)

* 그래프 최단거리

  2667 단지번호 붙이기-상하좌우 이동

  7576 토마토-상하좌우 이동

  [아기 상어 2 #17086](https://www.acmicpc.net/problem/17086) -상하좌우

  1697 숨바꼭질 - 특수한 이동

  [숨바꼭질3 #13549](https://www.acmicpc.net/problem/13549) - 특수한 이동

  [연구소 #14502](https://www.acmicpc.net/problem/14502) - 백트래킹 + bfs

  [현명한 나이트 #18404](https://www.acmicpc.net/problem/18404)- 특수한 그래프 이동 + 최단거리

  [DSLR #9019](https://www.acmicpc.net/problem/9019) - 특정한곳으로 이동 + 최단거리

  [텔레포트 정거장 #18232](https://www.acmicpc.net/problem/18232) - 1초 동안 순간이동, +1, -1 이동   + 최단거리

  [A->B #16953](https://www.acmicpc.net/problem/16953) - 특수한 이동(2배, 10배+1)

  

* 덩어리 갯수 구하기

​	[빙산 #2573](https://www.acmicpc.net/problem/2573) 

[	현수막 #14716](https://www.acmicpc.net/problem/14716)

​	[양 한마리... 양 두마리... #11123](https://www.acmicpc.net/problem/11123) 

​	[움직이는 미로 탈출 #16954](https://www.acmicpc.net/problem/16954) - 한칸씩 이동 후 다른함수 실행

​	[양치기 꿍 #3187](https://www.acmicpc.net/problem/3187) - 덩어리 요소 갯수 세기

​	[벽 부수고 이동하기 #14442](https://www.acmicpc.net/problem/14442) - 최단거리(범위, 중복처리(3개변수), 조건)



# DFS

방문처리, 재귀함수 사용

```java
static void dfs(int s,int len) {	// dfs
		if(len==4) {
			flag = true;
			return;
		} 
		for(int i : graph[s]) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i,len+1);
				visited[i] = false;
			}
		}
	}
```



## 문제

[ABCDE #13023](https://www.acmicpc.net/problem/13023)

[팀프로젝트 #9466](https://www.acmicpc.net/problem/9466)

[준오는 최종인재야!! #14657](https://www.acmicpc.net/problem/14657)-루트노드 찾기 + 루트노드에서 dfs

[트리의 부모 찾기 #11725](https://www.acmicpc.net/problem/11725) - 부모노드 찾기(루트노드 주어짐)

[스크루지 민호 #12896](https://www.acmicpc.net/problem/12896) - 트리의 지름 구하기, 루트노드 구하기



## 주의점 

처음거 방문처리
