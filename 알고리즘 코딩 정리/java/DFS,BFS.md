BFS -  덩어리 갯수, 최단거리

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



# 문제

기본 구현 - 1260 DFS와 BFS

연결된 그래프 이동 - 2606 바이러스, [등수 찾기 #17616](https://www.acmicpc.net/problem/17616)

상하좌우 이동 - 2667 단지번호 붙이기, 7576 토마토

특수한이동 - 1697 숨바꼭질, 13549 숨바꼭질3, 

