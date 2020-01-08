import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Canvia la taula per una llista (List<Character>)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.
 */
public class Fase2 {
	public static void main(String[] args) {
		List<Character> nom = new ArrayList<Character>(); 
		nom.add(0, 'R');  
		nom.add(1, 'A');
		nom.add(2, 'F');
		nom.add(3, 'A');
		nom.add(4, 'E');
		nom.add(5, 'L');


		Iterator<Character> it = nom.iterator();

		while (it.hasNext()) { 

			char caract =it.next();
			if (caract == '0' || caract == '1' || caract == '2' || caract == '3' || caract == '4' || caract == '5' || caract == '6' || caract == '7' || caract == '8' || caract == '9') {
				System.out.println("Els noms de persones no contenen números!");
			} else if (caract == 'A' || caract == 'E' || caract == 'I' || caract == 'O' || caract == 'U') {
				System.out.println("VOCAL");
			} else {
				System.out.println("CONSONANT");
			}

		} 

	}

}
