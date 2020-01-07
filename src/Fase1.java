
public class Fase1 {
	public static void main(String[] args) {
		/*Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
*/
		char nom[];
		nom = new char[6];
		nom[0] = 'R';
		nom[1] = 'A';
		nom[2] = 'F';
		nom[3] = 'A';
		nom[4] = 'E';
		nom[5] = 'L';
		
		for (int i=0; i<nom.length; i++) {
			System.out.print(nom[i]);
		}
		
		
		
	}
}
