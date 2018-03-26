package DepthFirstSearch;

import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;
	
	
	public DFS() {
		this.stack = new java.util.Stack<Vertex>();
	}
	
	public void dfs(java.util.List<Vertex> vertexList) {
		
		for(Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				//dfsWithStack(v);
				dfsRecursive(v);
			}
		}
	}
	
	private void dfsRecursive(Vertex v) {
		
		System.out.println(v +" ");
		for(Vertex vertex : v.getNeighborsList()) {
			if(!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
		
	}
	
	
	private void dfsWithStack(Vertex rootVertex) {
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		while(!this.stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex+" ");
			for(Vertex v : actualVertex.getNeighborsList()) {
				v.setVisited(true);
				this.stack.push(v);
			}
		}
	}
}
