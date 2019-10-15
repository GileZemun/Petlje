package forLoop;

public class ForPetlja {

	public static void main(String[] args) {
		
		/* for petlja ima 3 dela i svaki se deli sa ;
				
				System.out.println("Proizvodi su: ");
		
			for (int i = 1; i < 11; i ++) {
				
			  if ( i < 5) {
					
				int zbir = i + 6;
				System.out.println("Zbir je: " + zbir);
				
			  }else {
					
				int proizvod = i * 9;
				System.out.println("Proizvod je: " + proizvod);
					
	}
		 
				int proizvod = i * 9;
				System.out.println(i + " * 9 = " + proizvod);
		
	
			int pocetak = 198;
			int kraj = 21;
			
			if (pocetak < kraj) {
				
				for ( int i = pocetak; i <= kraj; i++) {
					
				 if (i%2 == 0) {
							  
					System.out.println(i + "- je paran broj");
				 }else {
					System.out.println(i + "- je neparan broj");
				 }
			}	
			
	}else {
		System.out.println("Nepostojeca vrednost");
		
		
		}*/

		for(int i = 1; i <=10; i++) {
			for (int j = 1; j <11; j++) {
				int proizvod = i * j;
				System.out.println(i + "*" + j + "=" + proizvod);
			}
		}
		}

}


