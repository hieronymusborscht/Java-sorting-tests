package iddfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private int depth_level= 0;
	private List<Node> adjacenciesList;
	
	public Node(String name) {
		this.name=name;
		this.adjacenciesList = new ArrayList<Node>();
	}
	
	public void addNeighbor(Node node) {
		this.adjacenciesList.add(node);
	}
	
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepth_level() {
		return depth_level;
	}

	public void setDepth_level(int depth_level) {
		this.depth_level = depth_level;
	}

	public List<Node> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Node> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}
}
