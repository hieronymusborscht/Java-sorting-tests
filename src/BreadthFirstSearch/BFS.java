package BreadthFirstSearch;

import java.util.Queue;

public class BFS {

	public void bfs(Vertex root) {
		Queue<Vertex> queue = new java.util.LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex+ " ");
			
			for(Vertex v : actualVertex.getNeighbors()) {
				v.setVisited(true);
				queue.add(v);
			}
		}
	}
	
}
