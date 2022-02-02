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
```



# ex

3차 dp - 2602 돌다리 건너기
