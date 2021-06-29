/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class OrdenTrabajo {

    private int idOt;
    private String notas;
    private String genera;
    private String responsable;

    public OrdenTrabajo() {
    }

        public int getIdOt() {
        return idOt;
    }

    public void setIdOt(int idOt) {
        this.idOt = idOt;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getGenera() {
        return genera;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
 
    
    
        public boolean validarCamposVacios() {
        boolean ok = true;

        if (this.getNotas().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Notas no puede estar vacío");
            ok = false;
        }
        if (this.getGenera()== "Seleccione Quien Genera") {
            JOptionPane.showMessageDialog(null, "El campo Genera no puede estar vacío");
            ok = false;
        }
        if (this.getResponsable()== "Seleccione Responsable") {
            JOptionPane.showMessageDialog(null, "El campo Responsable no puede estar vacío");
            ok = false;
        }
        return ok;
    }


}
