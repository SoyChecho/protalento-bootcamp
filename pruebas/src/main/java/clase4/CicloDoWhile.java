package clase4;

public class CicloDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] edades = new byte[] {25,78,15,20,12};
		
		int i = 0;
		
		do {
			//codigo: 1
			System.out.println("pos:" + i +", val:"+edades[i]);
			
			i++;
		}while( i < edades.length  );

		i = edades.length -1;
		
		do {
			//codigo: 1
			System.out.println("pos:" + i +", val:"+edades[i]);
			
			i--;
		}while( i >= 0  );

	}

}
