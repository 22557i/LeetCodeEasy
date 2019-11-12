package Homework1.Assignment1;
/*
 * written by Hao wu
 *
 * */
class Node{
	int Age;
	String Name;
	Node next;
	Node(){

	}
	Node(int x,String f){
		Age = x;
		Name = f;
	}
}

public class Requirement7_NodeStack {
	private Node top =null;
	public boolean push(Node newnode){
		if(top==null)top=newnode;
		else {
			newnode.next = top;
			top=newnode;
		}
		return true;
	}
	public Node pop(){
		Node result = null;
		if(top==null)return top;
		else{
			result = top;
			top=top.next;
		}
		return result;
	}
	public Node peek(){
		return top;
	}
	public boolean isEmpty(){
		return top==null;
	}

	public static void main(String[] args) {
		Requirement7_NodeStack r7 = new Requirement7_NodeStack();

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

		r7.push(node1);
		r7.push(node2);
		r7.push(node3);
		r7.push(node4);
		r7.push(node5);

		while (!r7.isEmpty()){
			Node temp = r7.pop();
			System.out.println(temp.Age+ " "+temp.Name);
		}
	}
}
