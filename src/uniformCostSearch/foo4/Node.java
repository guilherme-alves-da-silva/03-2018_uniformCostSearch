package uniformCostSearch.foo4;

import java.util.LinkedList;
import java.util.Comparator;

public class Node implements Comparator<Node>{
	private int value;
	private Node parent;
	private int level;
	private LinkedList<Node> children;
	private int cost; //cost to access this node

	public Node(){}
	public Node(int value, int cost){
		this.value=value;
		this.cost=cost;
		this.children=new LinkedList<Node>();
	}
	public Integer getValue(){
		return this.value;
	}
	public void addChild(Node newChild){
		newChild.setParent(this);
		newChild.setLevel(this.level+1);
		getChildren().add(newChild);
	}
	public LinkedList<Node> getChildren(){
		return this.children;
	}
	public Node getParent(){
		return this.parent;
	}
	public void setParent(Node node){
		this.parent=node;
	}
	public Integer getLevel(){
		return this.level;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public Integer getCost(){
		return this.cost;
	}
	@Override
	public int compare(Node a, Node b){
		int result=a.getCost().compareTo(b.getCost());

		if(result==0){
			result=a.getLevel().compareTo(b.getLevel());

			if(result==0){
				return Util.getLeft(a, b);
			}
			else{
				return result;
			}
		}
		else{
			return result;
		}
	}
}
