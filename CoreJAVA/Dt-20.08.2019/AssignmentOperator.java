public class AssignmentOperator {
	public static void main(String[] args){
		int i ;
		int j ;
		i = 10 ; 
		j = 20 ;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("*-*-*-*-*-*");

		j += i;
		System.out.println("+= j = "+j);

		j -= i;
		System.out.println("-= j = "+j);

		j *= i;
		System.out.println("*= j = "+j);

		j /= i;
		System.out.println("/= j = "+j);

		j %= i;
		System.out.println("%= j = "+j);
	}
}