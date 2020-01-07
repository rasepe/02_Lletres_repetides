import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.

Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.

	FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
 */
public class Fase4 {
	public static void main(String[] args) {
		List<Character> name = new ArrayList<Character>(); 
		name.add(0, 'R');  
		name.add(1, 'A');
		name.add(2, 'F');
		name.add(3, 'A');
		name.add(4, 'E');
		name.add(5, 'L');

		List<Character> surname = new ArrayList<Character>(); 
		surname.add(0, 'S');  
		surname.add(1, 'E');
		surname.add(2, 'R');
		surname.add(3, 'R');
		surname.add(4, 'A');

		List<Character> fullName = new ArrayList<Character>(); 

		Iterator<Character> itName = name.iterator();
		int comptador = 0;

		//afegim nom
		while (itName.hasNext()) { 
			char caract =itName.next();
			fullName.add(comptador, caract);
			comptador++;
		}
		//afegim espai
		fullName.add(comptador, ' ');
		comptador++;
		//afegim cognom
		Iterator<Character> itSurname = surname.iterator();
		while (itSurname.hasNext()) { 
			char caract =itSurname.next();
			fullName.add(comptador, caract);
			comptador++;
		}

		//imprimeix fullName (nom + ' ' + cognom):
		Iterator<Character> itFullName = fullName.iterator();
		while (itFullName.hasNext()) { 
			char caract =itFullName.next();
			System.out.print(caract);
		}

	}
}
