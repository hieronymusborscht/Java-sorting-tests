package DepthFirstSearch;

public class App {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		java.util.List<Vertex> list = new java.util.ArrayList<Vertex>();
		
		v1.addNeighbor(v2);
		v1.addNeighbor(v3);
		v3.addNeighbor(v4);
		v4.addNeighbor(v5);
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		DFS dfs = new DFS();
		dfs.dfs(list);
		
	}

}
