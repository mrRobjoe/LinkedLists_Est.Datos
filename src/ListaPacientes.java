
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
public class ListaPacientes {
    
    private LinkedList<Pacientes> nomPaci;
    private LinkedList<Medicamentos> listMed;
    private ListaMedicamentos lisMedicamentos;
    //private int index;
    
    public ListaPacientes(){
        nomPaci = new LinkedList<Pacientes>();
        this.lisMedicamentos = new ListaMedicamentos();
        this.listMed= new LinkedList<Medicamentos>();
        //index=0;
    }//Cierre ListaPacientes
    
    //Método para agregar a pacientes
    public void AgregarPaciente(){
        String eleccion;
        String paci;
        do {
            paci=(JOptionPane.showInputDialog("Digite el nombre del paciente: "));
            nomPaci.add(new Pacientes(paci,listMed));
            eleccion=JOptionPane.showInputDialog("¿Desea continuar agregando? digite Si o No.").toLowerCase();
        } while (! eleccion.equals("no"));
               
    }//Cierre AgregarPaciente
    
    //Método para consultar a pacientes
    public void ConsultarPacientes(){
        String contenido="Pacientes registrados\n"+
                "Cantidad de pacientes: "+CantPaci()+"\n";
        int i=0;
        for(Pacientes p: nomPaci){
            contenido+= i++ +" " + p.getNomPaciente() +": "+ p.MedicamentoAsignado()+"\n";
        }
        JOptionPane.showMessageDialog(null, contenido);
    }//Cierre ConsultarPacientes
    
    //Método para reportar pacientes sin medicamento
    public void ReporteSinMedicamento(){
        //CONTINUAR
        String contenido="Pacientes sin medicamentos: \n";
        for (Pacientes p: nomPaci) {
            if (p.MedicamentoAsignado().equals("")) {
                contenido += p.getNomPaciente()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, contenido);
    }//Cierre ReporteSinMedicamento
    
    //Método para borrar paciente
    public void BorrarPaciente(){
        String contenido="Pacientes disponibles.\n";
        ConsultarPacientes();
        if (nomPaci.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vacía, no se puede eliminar pacientes.");
        }else{
            int paciBorrar = Integer.parseInt(JOptionPane.showInputDialog("Digite el número del paciente a eliminar: "));
            nomPaci.remove(paciBorrar);
        }      
    }//Cierre BorrarPaciente
    
    public int CantPaci(){
        return nomPaci.size();
    }//Cierre CantPaci
    
    //Método para buscar un paciente
    public void BuscarPaciente(String pa){    
        int index=0;
        int encontrado=0;
        for(Pacientes paci: nomPaci){
            if (paci.getNomPaciente().equals(pa)) {
                Pacientes p=nomPaci.get(index);
                JOptionPane.showMessageDialog(null, "Paciente encontrado."); 
                p.AsignarMedicina();
                encontrado=1;
            }
            index++;
        }      
        if (encontrado==0) {
            JOptionPane.showMessageDialog(null, "El paciente digitado no existe.");
        }
    }//Cierre BuscarPaciente
    
    //Método para solicitar un paciente
    public String SolicitarPaciente(){
        String pacient;
        pacient =JOptionPane.showInputDialog("Digite el nombre del paciente a quien le asignará medicamentos: ");
        return pacient;
    }//Cierre SolicitarPaciente
    
}//Cierre clase
