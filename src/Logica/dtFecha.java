/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Esteban Menendez
 */
public class dtFecha {

    private String dia, mes, anio;

//CONSTRUCTOR//
    public dtFecha(String dia, String mes, String anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

//GETTERS//
    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAnio() {
        return anio;
    }
    
    public String getFecha(){
    String fecha=null;
    fecha = this.dia+"/"+this.mes+"/"+this.anio;
    
    
    
    return fecha;
    }

}
