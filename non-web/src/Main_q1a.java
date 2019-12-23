import java.util.Scanner;

class Stack implements DataStructure
{

	int array[];
	int top;
	int size;
	
	Stack(int size)
	{
		array=new int[size];
		this.size=size;
		top=0;
	}
	
	@Override
	public void push(int x) {
		if(!isFull())
			{
			array[top++]=x;
			System.out.println("Pushed "+x+" succesfully to stack\n\n");
			}
		
		else
			System.out.println("Stack Full\n\n");
	}

	@Override
	public int pop() {
		if(!isEmpty())
			return array[--top];
		
		return (-404);
	}

	@Override
	public boolean isEmpty() {
		if(top==0)
			return true;
		
		return false;
	}

	@Override
	public boolean isFull() {
		if(top==size)
			return true;
		
		return false;
	}
	
	public void displayStack()
	{
		if(!isEmpty())
		{
			System.out.println("The stack contents are:");
			for(int i=0; i<top; i++)
				System.out.print("	|"+array[i]+"|\n");
			System.out.println("\n\n");
		}
		
		else System.out.println("Stack Empty\n\n");
	}
	
}



public class Main_q1a {
	public static void main(String[] args)
	{
		/*
		Stack s=new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.push(21);
		s.displayStack();
		*/
		
		Scanner cin= new Scanner(System.in);
		System.out.print("\nEnter stack size: ");
		int size=cin.nextInt();
		Stack stack=new Stack(size);
		
		
		int ch=0;;
		do {
			System.out.println("Menu\n");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("Enter any other number to exit");
			System.out.print("\n\nEnter your choice: ");
			ch=cin.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("\nEnter the value to push: ");
				int x=cin.nextInt();
				stack.push(x);
				break;
			case 2:
				int y=stack.pop();
				if(y!=-404)
					System.out.println(y+" popped from stack\n\n");
				else System.out.println("Stack empty\n\n");
				break;
			case 3:
				stack.displayStack();
				break;
			default:
				System.out.println("Exiting...\n");
			}
		} while(ch>=1&&ch<=3);
		
		cin.close();
	}
}
