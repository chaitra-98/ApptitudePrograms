
public class Pttern {
	public static void main(String[] args) {
		int num=4;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if(i==j || i+j==num ) {
					 System.out.print(" * ");
				 }
				 else if(i==0||j==0||j==num||i==num) {
					 System.out.print(" @ ");
					  }
					else
					System.out.print(" _ ");
		
		// TODO Auto-generated method stub

	}
			System.out.println();

}

}
}
