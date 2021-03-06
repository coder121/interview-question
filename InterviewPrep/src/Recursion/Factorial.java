package Recursion;

public class Factorial {
public static void main(String... args){
	System.out.println(factorial(5));
	System.out.println(FactNonRecursive(5));
	
}

private static int factorial(int num) {
	//base condition
	if (num==0){
		return 1;
	}
	return num*factorial(num-1);
}
private static int FactNonRecursive(int num){
	int result=1;
	while(num>0){
		result=result*num;
		num--;
	}
	return result;
	
}
}
