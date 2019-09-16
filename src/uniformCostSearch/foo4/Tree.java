package uniformCostSearch.foo4;

import java.util.LinkedList;
import java.util.Collections;

public class Tree{
	private Node root;
	private LinkedList<Node> accessed;
	private LinkedList<Node> visited;
	private LinkedList<Node> nodesToCheck;

	public Tree(Node root){
		this.root=root;
	}
	public Node getRoot(){
		return this.root;
	}
	private LinkedList<Node> buildPath(LinkedList<Node> path, Node current){
		path.push(current);
		return path.peek()==root ? path : buildPath(path, current.getParent());
	}
	public LinkedList<Node> search(int value){
		accessed=new LinkedList<Node>();
		visited=new LinkedList<Node>();
		nodesToCheck=new LinkedList<Node>();

		return search(root, value);
	}
	private LinkedList<Node> search(Node current, int value){
		accessed.add(current);
		visited.add(current);

		if(current==null) return null;

		if(current.getValue()==value) return buildPath(new LinkedList<Node>(), current);

		if(!current.getChildren().isEmpty()){
			nodesToCheck.addAll(current.getChildren());
			Collections.sort(nodesToCheck, new Node());
		}
		return search(nodesToCheck.poll(), value);
	}
}
