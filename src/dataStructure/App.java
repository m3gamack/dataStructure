package dataStructure;

public class App {

	public static void main(String[] args) {
		
		//LinkedList a = new LinkedList();  
				//LinkedList b = new LinkedList();  

				//a.add(1);
				//a.add(2);
				//a.add(3);
				//a.add(4);
				
				//b.add(5);
				//b.add(6);
				//b.add(7);
				
				//System.out.println(a);
				//System.out.println(b);
				
				//a.combine(null);
				
				//System.out.println(a);
				//System.out.println(a.size());
				
				Stack nums = new Stack();
				nums.push(15);
				nums.push(8);
				nums.push(10);
				nums.push(7);
				nums.push(3);
				
				nums.show();
				nums.peek();


				System.out.println(nums.pop());
				
				nums.show();
				nums.peek();

	}

}
