/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import modelos.Empleado;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author denni
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       EmpleadoOficina John = new EmpleadoOficina(0001, "John", "Rodriguez", 1200.00, 2.1);
       EmpleadoOficina Fran = new EmpleadoOficina(0001, "Fran", "Amador", 3400.00, 5.3);
       EmpleadoOficina Alejandro = new EmpleadoOficina(0001, "Alejandro", "Pascua", 5600.00, 4.3); 
       
       EmpleadoProduccion Rodrigo = new EmpleadoProduccion(300.00, 0001, "Rodrigo", "Davila", 3200.00, 2.7);
       EmpleadoProduccion Maria = new EmpleadoProduccion(800.00, 0003, "Maria", "Cuaresma", 5900.00, 4.2);
       EmpleadoProduccion Karla = new EmpleadoProduccion(550.00, 0002, "Karla", "Sanchez", 3450.00, 6.8);
       
       Empleado Roberto = new Empleado(0001, "Roberto", "Gonzalez", 1000.00, 3.2);
       Empleado Carlo = new Empleado(0002, "Carlo", "Marin", 4000.00, 1.2);
       Empleado Jose = new Empleado(0003, "Jose", "Caldera", 2000.00, 4.5);
       
        System.out.println(Roberto.toString());
        
    }
    
}
