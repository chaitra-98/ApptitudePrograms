
public class EmptyRightAngle {
	public static void main(String[] args) {
		int num =5;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if(i+j==num || i==num || j==num)
					 System.out.print(" * ");
				 else
					 System.out.print("   ");

			}
			System.out.println();
		// TODO Auto-generated method stub

	}

}

}
