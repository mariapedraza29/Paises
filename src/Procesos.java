import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<String, ArrayList<String>> general;
	ArrayList<String> listCiu;
	
	public Procesos(){
		general = new HashMap<String, ArrayList<String>>();
	}
	public void iniciar() {
		listCiu = new ArrayList<>();
		regPais();
	}
	public void regPais() {
		String nomPais= "";
		String preg="";
		
		nomPais = JOptionPane.showInputDialog("Ingrese "
				+ "el nombre del país");
		listCiu.add(nomPais);
		do {
			regCiudad();
				
			preg=JOptionPane.showInputDialog("Ingrese si para ingresar otra ciudad");
	}while(preg.equalsIgnoreCase("si"));
		
		
		general.put(listCiu.get(0), listCiu);
		ListPaisCiuAsoc();
		
	}
	public void regCiudad() {
		String nomCiu="";
		nomCiu=JOptionPane.showInputDialog("Ingrese el nombre "
				+ "de la ciudad");

		listCiu.add(nomCiu);
		
	}
	
	public void ListPaisCiuAsoc() {
			String nombre=JOptionPane.showInputDialog("Ingrese el nombre del pais");
			if(listCiu.contains(nombre)) {
				for(String elemento: listCiu) {
					int pos=listCiu.indexOf(elemento);
					if(listCiu.get(pos).equalsIgnoreCase(nombre)) {
						System.out.println("el pais "+nombre+" contiene estas ciudades"+ listCiu);
					}
				}
			}else {
					System.out.println("Ese pais no existe");
			}
		ListCiu();
 	}
	public void ListCiu() {
		String nomCiu=JOptionPane.showInputDialog("Ingrese el nombre de la ciudad");
		if(listCiu.contains(nomCiu)) {
			for(String elemento: listCiu) {
				int pos=listCiu.indexOf(elemento);
				if(listCiu.get(pos).equalsIgnoreCase(nomCiu)) {
					System.out.println("La ciudad "+nomCiu+" está en el país "+ listCiu.get(0));
				}
			}
		}else {
				System.out.println("Ese ciudad no existe en ningún país");
		}
	
	}
}
