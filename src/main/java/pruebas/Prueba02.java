package pruebas;

import java.util.List;

import dao.TrabajadorDAO;
import dao.TrabajadorDAOImplement;
import model.Trabajador;

public class Prueba02 {

	public static void main(String[] args) {
		
		TrabajadorDAO trabajador = new TrabajadorDAOImplement();
		List<Trabajador> lista = trabajador.findAll();
		for (Trabajador r: lista) {
			System.out.println(r.getCodigoEmpleado());
			System.out.println(r.getNombre());
			System.out.println(r.getApellidos());
			System.out.println(r.getDni());
			System.out.println(r.isEstadoActividad());
		}	
	}

}
