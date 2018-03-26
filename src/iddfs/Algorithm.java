package iddfs;

public class Algorithm {

	private Node targetVertex;
	private volatile boolean isTargetFound;
	private java.util.Stack<Node> stack;

	public Algorithm(Node targetVertex) {
		this.targetVertex = targetVertex;
	}
	
	public void runDeepeningSearch(Node rootVertex) {
		
		int depth =0;
		stack = new java.util.Stack<Node>();
		while(!isTargetFound) {
			System.out.println("about to run dfs "+depth);
			dfs(rootVertex, depth);
		}
	}

	private void dfs(Node sourceVertex, int depthLevel) {
		System.out.println("depthlevel "+depthLevel);
		sourceVertex.setDepth_level(depthLevel);
		stack.push(sourceVertex);
		
		while(!stack.isEmpty()) {
			
			Node actualNode = stack.pop();
			System.out.print(actualNode+" ");
			
			if(actualNode.getName().equals(this.targetVertex.getName())) {
				System.out.println("node has been found...");
				this.isTargetFound=true;
				return;
			}
			
			System.out.println("search up to depth level "+depthLevel);
			
		
			
			for(Node node : actualNode.getAdjacenciesList()) {
				node.setDepth_level(node.getDepth_level()+1);
				stack.push(node);
			}
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			depthLevel++;
		}

	}
}
