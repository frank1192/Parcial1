package parcial1;
import Vista.*;
import Modelo.Modelo_Paciente ;
import controlador.Controlador_VistaPrincipal;
import Datos.DAO_paciente;

/**
 *
 * @author Franklin Aguirre
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaPrincipal VistaPrincial = new VistaPrincipal();
        Modelo_Paciente Modelo_Paciente= new Modelo_Paciente("","","","","");
        DAO_paciente DAO_paciente= new DAO_paciente();
        Controlador_VistaPrincipal Controlador_VistaPrincipal =new Controlador_VistaPrincipal( VistaPrincial,Modelo_Paciente ,DAO_paciente);
        
        Controlador_VistaPrincipal.iniciar();
        VistaPrincial.setVisible(true);
    }
    
}
