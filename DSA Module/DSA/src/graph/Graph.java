package graph;

import java.util.*;

public class Graph {

	Map<Integer, List<Integer>> adjList;

	public Graph() {
		// TODO Auto-generated constructor stub
		adjList = new HashMap<>();
	}

	void addEdge(int v1, int v2) {
		adjList.putIfAbsent(v1, new ArrayList<>());

		adjList.putIfAbsent(v2, new ArrayList<>());

		if (!adjList.get(v1).contains(v2)) {
			adjList.get(v1).add(v2);
		}

		if (!adjList.get(v2).contains(v1)) {
			adjList.get(v2).add(v1);
		}
	}

	void display() {
		for (Integer v : adjList.keySet()) {
			System.out.println(v + " -> " + adjList.get(v));

		}

	}

	void dfs(int start) {
		Set<Integer> visited = new HashSet<>();

		dfsRec(start, visited);

	}

	void dfsRec(int start, Set<Integer> visited) {
		// TODO Auto-generated method stub

		System.out.println(start);

		visited.add(start);

		List<Integer> ver_list = adjList.get(start);
		for (Integer nv : ver_list) {
			if (!visited.contains(nv)) {
				dfsRec(nv, visited);
			}
		}

	}

	void bfs(int start) {
		Set<Integer> visited = new HashSet<>();

		Queue<Integer> queue = new LinkedList<>();

		visited.add(start);
		queue.add(start);

		while (!queue.isEmpty()) {
			int v = queue.remove();
			System.out.println(v);
			List<Integer> ver_list = adjList.get(v);
			for (Integer nv : ver_list) {

				if (!visited.contains(nv)) {
					queue.add(nv);
					visited.add(nv);
				}
			}
		}
	}

}
