import java.util.Scanner;

class StringPruefer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Objekt und Variable für die Eingabe
		
		
		Scanner stringPruefen = new Scanner(System.in);
		
		String l = stringPruefen.nextLine();
		
		// Überprüfung der Zeichenketten-Länge mit if-Abfrage
		
		if (l.length()<=4) {
			
			System.out.println("String ist leider zu klein.");
		}
		else if (l.length()>=20) {
			
			System.out.println("String ist leider zu groß.");
		} else {
		
			char umkehren = 0;
		// String in Char zerlegen, String wird mit i-- rückwärts durchlaufen 
			
			for(int i=l.length()-1;i>=0;i--) {
				
				 umkehren = l.charAt(i);
				System.out.println(umkehren);
				
			}
			
			//While-Schleife
			// Zähle vom Anfang 0 hoch und vom Ende runter so lang wie das Wort ist - 1 und vergleiche die chars / Buchstaben
			int anfang = 0;
			int ende = l.length()-1;
			
			while((l.charAt(anfang)==l.charAt(ende)) && (ende >0)) {
				
				 anfang++;
				 ende--;		
			}
			
		if(ende==0) {
	
			System.out.println("\nPalindrom vorhanden");
			
		} else {
			System.out.println("\nKein Palindrom");
		}
			
			
		} 
		}
	}

		
	

