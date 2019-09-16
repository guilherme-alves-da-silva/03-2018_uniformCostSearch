package uniformCostSearch.foo4;

public class Main{
	public static void main(String[] args){
		Tree t=new Tree(new Node(4, 0));
/*
		//test 1 on cost
		t.getRoot().addChild(new Node(5, 4));
		t.getRoot().addChild(new Node(2, 9));
		t.getRoot().addChild(new Node(8, 2));

		t.getRoot().getChildren().get(0).addChild(new Node(3, 5));
		t.getRoot().getChildren().get(0).addChild(new Node(1, 4));

		t.getRoot().getChildren().get(1).addChild(new Node(4, 2));
		t.getRoot().getChildren().get(1).addChild(new Node(9, 5));

		//test 2 on level
		t.getRoot().addChild(new Node(5, 2));
		t.getRoot().addChild(new Node(2, 1));
		t.getRoot().addChild(new Node(8, 4));

		t.getRoot().getChildren().get(0).addChild(new Node(3, 5));
		t.getRoot().getChildren().get(0).addChild(new Node(1, 4));

		t.getRoot().getChildren().get(1).addChild(new Node(4, 2));
		t.getRoot().getChildren().get(1).addChild(new Node(9, 5));
*/
		//test 3 on left
		t.getRoot().addChild(new Node(5, 2));
		t.getRoot().addChild(new Node(2, 7));
		t.getRoot().addChild(new Node(8, 4));

		t.getRoot().getChildren().get(0).addChild(new Node(3, 5));
		t.getRoot().getChildren().get(0).addChild(new Node(1, 4));

		t.getRoot().getChildren().get(1).addChild(new Node(4, 7));
		t.getRoot().getChildren().get(1).addChild(new Node(9, 7));

		Util.printTree(t.getRoot());
		Util.printList(t.search(9));
		Util.printList(t.search(6));
	}
}
