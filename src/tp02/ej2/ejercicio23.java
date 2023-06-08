package tp02.ej2;
import tp01b.ejercicio3.*;
import tp02.ejercicio2.*;
public class ejercicio23 {

	public static void main(String[] args) {
		Estudiante e1= new Estudiante ("Juan","Perez","B","juan_pikachu@gmail.com","calleFalsa 123");
		ListaEnlazadaGenerica<Estudiante> L= new ListaEnlazadaGenerica<Estudiante>();
		L.agregarInicio(e1);
		System.out.print(L.proximo().tusDatos());
	}

}
