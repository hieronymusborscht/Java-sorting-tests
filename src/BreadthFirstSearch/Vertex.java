package BreadthFirstSearch;


public class Vertex {
	private int data;
	private boolean visited;
	private java.util.List<Vertex> adjacenciesList;
	
	public Vertex(int data) {
		this.data=data;
		this.adjacenciesList = new java.util.ArrayList<Vertex>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public java.util.List<Vertex> getNeighbors() {
		return adjacenciesList;
	}

	public void setNeighbors(java.util.List<Vertex> neighbors) {
		this.adjacenciesList = neighbors;
	}
	public void addNeighborVertex(Vertex v) {
		this.adjacenciesList.add(v);
	}
	
	@Override
	public String toString() {
		return ""+this.data;
	}
}
