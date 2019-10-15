package forLoop;

import java.util.Scanner;

public class VezbanjeForPetlje {

	public static void main(String[] args) {
		
		/*int proizvod = 1;
		
		for(int i = 1; i<6; i++) {
			
			proizvod = proizvod * i;			
			
		}
		System.out.println("Proizvod je: " + proizvod);*/
		
		int brojac = 0;
		int ukupnoBrojeva = 0;
		int brojacNeparnih = 0;
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Unesite pocetnu vrednost: ");
		
			int pocetnaVrednost = skener.nextInt();
		
		System.out.println("Unesite krajnju vrednost: ");
		
			int krajnjaVrednost = skener.nextInt();
		
				skener.close();	
				
			if (pocetnaVrednost == krajnjaVrednost)  {
				
				System.out.println("Vrednosti su iste!!!");
				
			}else {
				
				if (krajnjaVrednost > pocetnaVrednost) {
					
					for (int i = pocetnaVrednost; i<= krajnjaVrednost; i++) {
						
						ukupnoBrojeva ++;
					
				if(i%2 == 0) {
						
						brojac ++;
						
				}else { 
						
						brojacNeparnih++;
					}
						
				
				}
				
				System.out.println("Parnih brojeva ima: " + brojac);
				System.out.println("Ukupno brojeva ima: " + ukupnoBrojeva);
				System.out.println("Neparnih brojeva ima: " + brojacNeparnih); 
					
				}else { 
					
				System.out.println("Nepostojeca vrednost!!!");
					
					
				}
				
			}
				
			
		
		
		
		
		
		
		
	}
}
