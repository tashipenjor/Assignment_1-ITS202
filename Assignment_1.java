
public class Assignment_1
{
	double one_over_four = 0.25;
	double three_over_four = 0.75;
	int volume = 4;
	static int a;
	int remove;
	int top = 0;
	static double length;
	static int Array[];
	public Assignment_1()
	{
		Array = new int[volume];
	}
	public void add(int x)
	{
		Array[top] = x;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) {
			count++;
		}
		a = count;
		length = (double)a/volume;
		System.out.println("Remove Element " +remove);
	}
	
	public void resize()
	{
		if(length == one_over_four ) {
			int newArray[] = new int[(volume/2)*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			volume = volume/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == three_over_four) {
			int newArray[] = new int[volume*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			volume = volume * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange!!!");
		}
	}
	public int size()
	{
		return volume;
	}
	public String toString()
	{
		String t = Integer.toString(volume);
		return t;
	}

	public static void main(String[] args) {
		Assignment_1 obj = new Assignment_1();
		obj.add(3);
		obj.add(6);
		obj.add(9);
		obj.add(7);
		obj.pop();
		obj.resize();
		System.out.println("toString " +obj.toString());
		System.out.println("The number of elements in the new Array is " +a);
		System.out.println("The Size of new Array is " +obj.size());
	}
}
