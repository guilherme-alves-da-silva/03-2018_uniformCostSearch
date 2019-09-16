package uniformCostSearch.foo4;

import java.util.LinkedList;

public class Util{
	private Util(){}

	//used just for testing, not needed for the algorithm to work
	public static void printList(LinkedList<Node> list){
		System.out.print("List: ");

		if(list==null) System.out.print("null");

		else{
			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i).getValue()+" ");
		}
		System.out.println();
	}

	//used just for testing, not needed for the algorithm to work
	public static void printTree(Node node){
		System.out.print("Node: "+node.getValue()+"; cost: "+node.getCost()+
				"; level: "+node.getLevel()+"\n  Children: ");

		for(int i=0;i<node.getChildren().size();i++)
			System.out.print(node.getChildren().get(i).getValue()+" ");

		System.out.println("\n");

		for(int i=0;i<node.getChildren().size();i++)
			printTree(node.getChildren().get(i));
	}

	public static Integer getLeft(Node a, Node b){
		if(a.getParent()==b.getParent()){
			Integer indexOfA=a.getParent().getChildren().indexOf(a);
			Integer indexOfB=b.getParent().getChildren().indexOf(b);

			return indexOfA.compareTo(indexOfB);
		}
		else return getLeft(a.getParent(), b.getParent());
	}
}
