package modelos;


/**
 * @author denni
 * @version 1.0
 * @created 30-Nov-2021 4:07:29 PM
 */
public class EmpleadoProduccion extends Empleado {

	private double bono;

	public EmpleadoProduccion(){

	}

    public EmpleadoProduccion(double bono, int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
        super(id, nombre, apellidos, salarioBase, horasExtras);
        this.bono = bono;
    }



    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
        
        

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end EmpleadoProduccion