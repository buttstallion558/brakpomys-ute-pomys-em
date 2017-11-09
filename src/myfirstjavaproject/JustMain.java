package myfirstjavaproject;

class Stack { 
	private int[] tab;
	private int end = -1;
	
	public Stack(int size) {
		tab = new int[size];
	}
	
	public int pop() throws Exception {
		if(end < 0) throw new Exception("PUSTA");
		return tab[end--];
	}
	public boolean push(int a) {
		if(end + 1 > tab.length) return false;
		tab[++end] = a;
		return true;
	}
	public int look() throws Exception {
		if(end < 0) throw new Exception("PUSTA");
		return tab[end];
	}
	public int getSize() {
		return end + 1;
	}
	
	public void print() {
		System.out.println("Index: " + end + " size " + getSize());
		for(int e : tab) {
			System.out.print(e + ", ");
		}
		System.out.println();
	}
}

public class JustMain {

	public static void main(String[] args) {
		final int SIZE = 10;
		Stack q = new Stack(SIZE);
		for(int i = 0; i < SIZE; i++) q.push(i*i);
		try {
			for(int i = 0; i < SIZE / 2; i++)
				System.out.print(q.pop() + "\t"); 
			System.out.println("\nNastępna " + q.look());
			System.out.println("Rozmiar: " + q.getSize());
			q.print();
			
		} catch( Exception e) {
			System.out.println(e.toString());
		}
		for(int i = 0; i < SIZE / 2; i++) q.push(i*10);
		q.print();
		try {
			for(int i = 0; i < SIZE; i++)
				System.out.print(q.pop() + "\t"); 
			System.out.println("\nRozmiar: " + q.getSize());
			
		} catch( Exception e) {
			System.out.println(e.toString());
		}		
	}
}
