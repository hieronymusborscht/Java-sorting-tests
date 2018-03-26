package DepthFirstSearch;

import java.util.List;
import java.util.ArrayList;

public class Vertex {
	private String name;
	private boolean visited;
	private List<Vertex> neighborsList;
	
	public Vertex(String n) {
		this.name = n;
		this.neighborsList = new ArrayList<Vertex>();
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public boolean isVisited() {
		return visited;
	}

	public void addNeighbor(Vertex v) {
		this.neighborsList.add(v);
	}


	public void setVisited(boolean visited) {
		this.visited = visited;
	}




	public List<Vertex> getNeighborsList() {
		return neighborsList;
	}




	public void setNeighborsList(List<Vertex> neighborsList) {
		this.neighborsList = neighborsList;
	}




	@Override
	public String toString() {
		return name;
	}
}
