import java.util.Scanner;

class StringPrueferErsteLoesung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				//Objekt und Variable f�r die Eingabe
				
				Scanner stringPruefen = new Scanner(System.in);
				
				String l = stringPruefen.nextLine();
				
				// �berpr�fung der Zeichenketten-L�nge mit if-Abfrage
				
				if (l.length()<=4) {
					
					System.out.println("String ist leider zu klein.");
				}
				else if (l.length()>=20) {
					
					System.out.println("String ist leider zu gro�.");
				} else {
				
					
				// Variable au�erhalb der Schleife deklariert, damit diese keine lokale Variable ist
					
					char umkehren=0;
					
				// String in char zerlegen und mit For-Schleife  R�ckw�rts-Durchlauf (i--) des Strings l 
		
					for(int i=l.length()-1;i>=0;i--) {
						
						 umkehren = l.charAt(i);
						
						System.out.println(umkehren);
						
						}
				// char zu String, damit umgedrehte Ausgabe mit der Eingabe abgeglichen werden kann
					
					String pali = String.valueOf(umkehren);
					
					// Pr�fen, ob Eingabe indentisch mit umgedrehter Ausgabe ist - funktioniert noch nicht. Der Abgleich l==pali ist wirkungslos.
					 
						if(l==pali) {
							System.out.println("Das ist ein Palindrom");
						} else { System.out.println("Kein Pali");
					
					}
					
				} 
				}
			}


	


