/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author denni
 */
public interface IOperaciones {
    
    public int agregarRegistro(Object o);
    
    public ArrayList<Object> mostrarRegistros();
}
