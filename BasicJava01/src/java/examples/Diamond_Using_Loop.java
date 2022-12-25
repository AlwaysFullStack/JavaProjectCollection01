package java.examples;

public class Diamond_Using_Loop {

	public static void main(String[] args) {
		int n=7;
		int i=0;
		int j=1;
		for(; i<n; i++) {
			for(;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(;j<=n+i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
