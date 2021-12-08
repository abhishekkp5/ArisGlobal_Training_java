package project1;

public class Pattern {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<(n*2)-1;i++) {
			for(int j=1;j<(n*2);j++) {
				if(i<n) {
				if(j>=n-i&&j<=n+i)
					System.out.print(".");
				else {
					System.out.print("*");
				}					
			}else {
				if(j<=i-n+1||j>=(n*2)-(i-n+1)) {
					System.out.print("*");}
					else {
						System.out.print(".");
					}
			}
	}
			System.out.print("\n");	
		}		
	}
}
