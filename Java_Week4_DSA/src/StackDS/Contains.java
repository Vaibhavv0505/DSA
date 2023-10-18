package StackDS;

public class Contains {
	
	public static boolean contain(Stack stack, int element) {
		for(int i = 0; i <= stack.top; i++) {
			if(stack.list[i] == element) {
				return true;
			}
		}
		return false;
	}
	
}
