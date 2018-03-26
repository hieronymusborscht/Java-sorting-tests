package iddfs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node node0 = new Node("A");
		Node node1 = new Node("B");
		Node node2 = new Node("C");
		Node node3 = new Node("D");
		Node node4 = new Node("E");
		//Node node6 = new Node("F");
		
		node0.addNeighbor(node1);
		node0.addNeighbor(node2);
		node1.addNeighbor(node3);
		node3.addNeighbor(node4);
		
		Algorithm algorithm = new  Algorithm(node4);
		algorithm.runDeepeningSearch(node0);
	
	}

}
