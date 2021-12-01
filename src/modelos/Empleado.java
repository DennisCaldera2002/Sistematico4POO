package modelos;


/**
 * @author denni
 * @version 1.0
 * @created 30-Nov-2021 4:07:25 PM
 */
public class Empleado {

	private String apellido;
	private double horasExtras;
	private int id;
	private String nombre;
	private double salarioBase;

	public Empleado(){

	}

    public Empleado(int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
        this.apellido = apellidos;
        this.horasExtras = horasExtras;
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "apellidos=" + apellido + ", horasExtras=" + horasExtras + ", id=" + id + ", nombre=" + nombre + ", salarioBase=" + salarioBase + '}';
    }
        
        

	public void finalize() throws Throwable {

	}
	public double calcularSalarioBruto(){
		return 0;
	}

	public float calcularSalarioNeto(){
		return 0;
	}

	public double calcularSeguro(){
		return 0;
	}
}//end Empleado