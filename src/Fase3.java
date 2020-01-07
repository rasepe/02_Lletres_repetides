import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map; 

/*Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
 */
public class Fase3 {
	public static void main(String[] args) {
		
		
		List<Character> nom = new ArrayList<Character>(); 
		Map<Character, Integer> lletres = new LinkedHashMap<Character, Integer>();
		
		
		nom.add(0, 'R');  
		nom.add(1, 'A');
		nom.add(2, 'F');
		nom.add(3, 'A');
		nom.add(4, 'E');
		nom.add(5, 'L');
		//nom.add(6, 'L');
		//nom.add(7, 'A');
		
		Iterator<Character> it = nom.iterator();
        
		int pos = 0;
		
		
		System.out.println("ARRAYLIST:");
		while (it.hasNext()) { 

			char caract =it.next();
			System.out.println(caract);
			pos++;
			
			int ocurrencies = 0;
			
			 
			
			for (int i=0 ; i<pos ; i++) {
				if (caract == nom.get(i)) {
					ocurrencies++;
				}
			}
			
			//System.out.println(ocurrencies);
			
			
			lletres.put(caract, ocurrencies); 
		}
			/*
			 * if (ocurrencies == 1) { //Afegeix nova posicio map lletres.put(caract, 1);
			 * 
			 * } else { //Modifica posici� lletres.put(caract, 1); }
			 */

			Iterator itmap = lletres.keySet().iterator();
			System.out.println("LINKEDHASHMAP:");
			while(itmap.hasNext()){
				//System.out.println("hola");
				Character caracter = (Character) itmap.next();
				System.out.println(caracter + " " + lletres.get(caracter));
				//Object key = ;
				//System.out.println("Clave: " + itmap.next()); // + " -> Valor: " + lletres.get(itmap.next()));

			//  System.out.println("Clave: " + key + " -> Valor: " + lletres.get(key));
			}
			
			 
			 
			
		} 
	
}