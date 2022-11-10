
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
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
public class ListaMedicamentos {
    
    private LinkedList<Medicamentos> nomMedi;
    private Pacientes pa;
    
    public ListaMedicamentos(){
        nomMedi = new LinkedList<Medicamentos>();
        this.pa=new Pacientes();
    }//Cierre ListaMedicamentos
    
    //Método para agregar medicamentos
    public void AgregarMedicamento(){
        String eleccion;
        String med;
        do {
            med=(JOptionPane.showInputDialog("Digite el nombre del medicamento: "));
            nomMedi.add(new Medicamentos(med));
            //this.lisMed.AgregarMedicamento(this.getNomMedicamento());
            eleccion=JOptionPane.showInputDialog("¿Desea continuar agregando? digite Si o No.").toLowerCase();
        } while (! eleccion.equals("no"));    
        //nomMedi.add(medic);
    }//Cierre AgregarMedicamento
    
    //Método para asignar medicamentos a un paciente
    public void AsignarMedicamento(){
        ListaPacientes lisMed = new ListaPacientes();
        lisMed.BuscarPaciente(lisMed.SolicitarPaciente());
        
    }//Cierre AsignarMedicamento
    
    //Métodod para consultar los medicamentos
    public void ConsultarMedicamentos(){
        String contenido = "Medicamentos registrados\n"+
                "Cantidad de medicamentos: "+CantidadMed()+"\n";
        int i =0;
        for (Medicamentos med: nomMedi) {
            contenido+= i++ +" "+ med.getNomMedicamento()+"\n";
        }
        JOptionPane.showMessageDialog(null, contenido);
    }//Cierre ConsultarMedicamentos
    
    //Método para borrar medicamentos
    public void BorrarMedicamento(){
        String contenido="Medicamentos disponibles.\n";
        ConsultarMedicamentos();
        if (nomMedi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vacía, no se puede eliminar medicamentos.");
        }else{
            int medBorrar = Integer.parseInt(JOptionPane.showInputDialog("Digite el número del medicamento a borrar: "));
            nomMedi.remove(medBorrar);
            
        }      
    }//Cierre BorrarMedicamento
    
    //Método para determinar la cantidad de medicamentos 
    public int CantidadMed(){
        return nomMedi.size();
    }//Cierre CantidadMed
    
    
}//Cierre clase
