
package es.iesjandula.peajes.launcher;
import es.iesjandula.peajes.tikets.Itikets;
import es.iesjandula.peajes.tikets.TiketEspecial;
import es.iesjandula.peajes.tikets.TiketGeneral;
public class Launcher {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		System.out.println("General sin descuento:");
		TiketGeneral general = new TiketGeneral(0, 0.5);
		general.registrarSalida(99);
		System.out.println(general.calculoDeTarifa());
		
		System.out.println("General con descuento:");
		TiketGeneral general2 = new TiketGeneral(0, 0.5);
		general.registrarSalida(100);
		System.out.println(general.calculoDeTarifa());
		
		System.out.println("Especial sin descuento:");
		TiketEspecial especial = new TiketEspecial(0, 0.5,20);
		especial.registrarSalida(499);
		System.out.println(especial.calculoDeTarifa());
		
		System.out.println("Especial con descuento:");
		TiketEspecial especial2 = new TiketEspecial(0, 0.5,20);
		especial.registrarSalida(500);
		System.out.println(especial.calculoDeTarifa());
	}

}
