
public class Dpattern {
	public static void main(String[] args) {
		int num =4;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if(i==0  && j!=4||j==1||i==4 && j!=4||j==4 && i!=0&&i!=4)
					 System.out.print(" * ");
				 else
					 System.out.print("   ");

			}
			System.out.println();
		// TODO Auto-generated method stub

	}

}

}
