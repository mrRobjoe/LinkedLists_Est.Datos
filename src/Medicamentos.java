
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joharie Enríquez
 */
public class Medicamentos {
    private String nomMedicamento;
    private int cantPacientes;
    
    public Medicamentos(String nomMedicamento){
        this.nomMedicamento = nomMedicamento;
        this.cantPacientes =0;
    }

    public String getNomMedicamento() {
        return nomMedicamento;
    }

    public void setNomMedicamento(String nomMedicamento) {
        this.nomMedicamento = nomMedicamento;
    }

    public int getCantPacientes() {
        return cantPacientes;
    }

    public void setCantPacientes(int cantPacientes) {
        this.cantPacientes = cantPacientes;
    }
    
}//Cierre clase
