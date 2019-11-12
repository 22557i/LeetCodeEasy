package Homework1.Assignment1;

/*
* author: Hao Wu
*
* */
public class Requirement9 {

	public static void main(String[] args) {
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
		Requirement8_ArrayStack r8 = new Requirement8_ArrayStack();
		Requirement8_ArrayStack r8_1 = new Requirement8_ArrayStack();

		Requirement7_NodeStack r7 = new Requirement7_NodeStack();
		Requirement7_NodeStack r7_1 = new Requirement7_NodeStack();
		long starttime;
		long endtime;
// small data:
		System.out.println("comapring test of Small data---------------------");
		starttime = System.nanoTime();
		r7.push(node1);
		r7.push(node2);
		r7.push(node3);
		r7.push(node4);
		r7.push(node5);

		while (!r7.isEmpty()){
			Node temp = r7.pop();
			System.out.println(temp.Age+ " "+temp.Name);
		}
		endtime = System.nanoTime();
		System.out.println("Node stack use"+ (endtime-starttime)+"ns for small data");
		starttime = System.nanoTime();
		r8.push(node1);
		r8.push(node2);
		r8.push(node3);
		r8.push(node4);
		r8.push(node5);

		while (!r8.isEmpty()){
			Node temp = r8.pop();
			System.out.println(temp.Age+ " "+temp.Name);
		}
		endtime = System.nanoTime();
		System.out.println("Array stack use"+ (endtime-starttime)+"ns for small data");

		System.out.println("Comparing test of large data------------");
		starttime = System.currentTimeMillis();
		int n =10000;
		while(n>-1) {
			String s= "Name"+n;
			r7_1.push(new Node(n,s));
			n--;
		}
		while (!r7_1.isEmpty()){
			Node temp = r7_1.pop();
			//System.out.println(temp.Age+ " "+temp.Name);
		}
		endtime = System.currentTimeMillis();
		System.out.println("Node stack use"+ (endtime-starttime)+"ms for large data");
		starttime = System.currentTimeMillis();
		n=10000;
		while(n>-1) {
			String s= "Name"+n;
			r8_1.push(new Node(n,s));
			--n;
		}
		while (!r8_1.isEmpty()){
			Node temp = r8_1.pop();
			//System.out.println(temp.Age+ " "+temp.Name);
		}
		endtime = System.currentTimeMillis();
		System.out.println("Array stack use"+ (endtime-starttime)+"ms for large data");


	}
}
