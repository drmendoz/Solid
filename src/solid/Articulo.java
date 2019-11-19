/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author CltControl
 */
public abstract class Articulo  {

    String nomArticulo ;
    float precio;

    public Articulo(String nomArticulo, float precio) {
        this.nomArticulo = nomArticulo;
        this.precio = precio;
    }
    
}
