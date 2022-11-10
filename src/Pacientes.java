
import java.util.LinkedList;
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
public class Pacientes {

    String nomPaciente;
    LinkedList<String> nombreMedi = new LinkedList<String>();
    LinkedList<Medicamentos> med = new LinkedList<Medicamentos>();
    private ListaMedicamentos lisMed;

    public Pacientes(String nomPaciente, LinkedList list) {
        this.nomPaciente = nomPaciente;
        this.lisMed = new ListaMedicamentos();
    }

    public Pacientes() {
        this.nomPaciente = "NO definido";
    }

    public String getNomPaciente() {
        return nomPaciente;
    }

    public void setNomPaciente(String nomPaciente) {
        nomPaciente = nomPaciente;
    }
    
    //Método para obtener los medicamentos asignados a cada paciente
    public String MedicamentoAsignado() {
        String asignado = "";
        int i = 0;
        for (String m : nombreMedi) {
            asignado += nombreMedi.get(i) + ", ";
            i++;
        }
        return asignado;
    }//Cierre MedicamentoAsignado
    
    //Método para asignar medicina a paciente
    public void AsignarMedicina() {
        //int encontrado = 0;
        String medicam = JOptionPane.showInputDialog("Digite el nombre del medicamento a asignar: ");
        nombreMedi.add(medicam);
        /*for (Medicamentos m : med) {
            if (m.getNomMedicamento().equals(medicam)) {
                nombreMedi.add(medicam);
                JOptionPane.showMessageDialog(null, "Medicamento encontrado.");
                encontrado = 1;
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "La medicina digitada no existe.");
        }*/
    }//Cierre AsignarMedicina

    public LinkedList<String> getNombreMedi() {
        return nombreMedi;
    }

    public void setNombreMedi(LinkedList<String> nombreMedi) {
        this.nombreMedi = nombreMedi;
    }
}//Cierre clase
