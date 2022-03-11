# BFS 

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

기본 구현 - 1260 DFS와 BFS

연결된 그래프 이동 - 2606 바이러스, [등수 찾기 #17616](https://www.acmicpc.net/problem/17616)

상하좌우 이동 - 2667 단지번호 붙이기, 7576 토마토

특수한이동 - 1697 숨바꼭질, [숨바꼭질3 #13549](https://www.acmicpc.net/problem/13549), 

[연구소 #14502](https://www.acmicpc.net/problem/14502) - 백트래킹 + bfs



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



## 주의점 

처음거 방문처리
