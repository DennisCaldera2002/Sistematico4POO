package modelos;


/**
 * @author denni
 * @version 1.0
 * @created 30-Nov-2021 4:07:27 PM
 */
public class EmpleadoOficina extends Empleado {

	public EmpleadoOficina(){

	}

    public EmpleadoOficina(int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
        super(id, nombre, apellidos, salarioBase, horasExtras);
    }

    
        
        

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end EmpleadoOficina