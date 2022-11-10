
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
public class MenuClinica {
    
    private ListaMedicamentos medicamentos;
    private ListaPacientes pacientes;
    
    public MenuClinica(){
        this.medicamentos=new ListaMedicamentos();
        this.pacientes=new ListaPacientes();
    }
    
    //mostrar menú
    public void MostrarMenu(){
        String opcionesMenu="";
        int opcion=0;
        
        //opciones menú
        opcionesMenu+="****Clínica pacientes****\n";
        opcionesMenu+="Escoga una opción:\n";
        opcionesMenu+="1.Agregar paciente\n";
        opcionesMenu+="2.Agregar medicamentos\n";
        opcionesMenu+="3.Asignar medicamentos\n";
        opcionesMenu+="4.Consultar pacientes\n";
        opcionesMenu+="5.Consultar medicamentos\n";
        opcionesMenu+="6.Borrar medicamentos\n";
        opcionesMenu+="7.Borrar Paciente\n";
        opcionesMenu+="8.Reportes de pacientes sin medicamentos\n";
        opcionesMenu+="9.Salir.";
        
        //Loop
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, opcionesMenu));
            
            switch(opcion){
                //proceso
                case 1:
                    this.pacientes.AgregarPaciente();
                    break;
                case 2:
                    this.medicamentos.AgregarMedicamento();
                    break;
                case 3:          
                    this.pacientes.BuscarPaciente(pacientes.SolicitarPaciente());
                    break;
                case 4:
                    this.pacientes.ConsultarPacientes();
                    break;
                case 5:
                    this.medicamentos.ConsultarMedicamentos();
                    break;
                case 6:
                    this.medicamentos.BorrarMedicamento();
                    break;
                case 7:
                    this.pacientes.BorrarPaciente();
                    break;
                case 8:
                    this.pacientes.ReporteSinMedicamento();
                    break;
                case 9:
                    break;
            }
            
        } while (opcion!=9);
        
    }//Cierre MostrarMenu
}//Cierre clase
