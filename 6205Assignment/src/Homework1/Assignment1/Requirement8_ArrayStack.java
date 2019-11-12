package Homework1.Assignment1;

/*
* written by Hao wu
*
* */
public class Requirement8_ArrayStack {
	private Node[] items;
	private int size=0;
	int point=-1;


	public void push(Node node){
		Node temp [] = new Node[++size];
		for (int i = 0; i < size-1; i++) {
			temp[i]=items[i];
		}
		temp[size-1]=node;
		point++;
		items = temp;
	}
	public Node pop(){
		if(point==-1)return null;
		Node res = items[point--];
		Node[]temp = new Node[size-1];
		for (int i = 0; i <size-1 ; i++) {
			temp[i]=items[i];

		}
		items = temp;
		return res;
	}
	public Node peek(){
		return items[point];
	}
	public boolean isEmpty(){
		return point==-1;
	}

	public static void main(String[] args) {
		Requirement8_ArrayStack r8 = new Requirement8_ArrayStack();


		Node node1 = new Node();
		node1.Age=31;
		node1.Name = "Name1";

		Node node2 = new Node();
		node2.Age = 24;
		node2.Name = "Name2";

		Node node3 = new Node();
		node3.Age =10;
		node3.Name = "Name3";

		Node node4 = new Node();
		node4.Age=44;
		node4.Name = "Name4";

		Node node5 = new Node();
		node5.Age=81;
		node5.Name = "Name5";

		r8.push(node1);
		r8.push(node2);
		r8.push(node3);
		r8.push(node4);
		r8.push(node5);
		while (!r8.isEmpty()){
			Node temp = r8.pop();
			System.out.println(r8.isEmpty());
			System.out.println(temp.Age+ " "+temp.Name);

		}
		System.out.println(r8.isEmpty());
		System.out.println("Writte by Hao Wu");
	}
}
