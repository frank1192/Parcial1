
package controlador;

import Vista.VistaPrincipal;
import Modelo.Modelo_Paciente;
import Datos.DAO_paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author Franklin Aguirre
 */
public class Controlador_VistaPrincipal implements ActionListener{
    
    private VistaPrincipal VistaPrincipal;
    private Modelo_Paciente Modelo_Paciente;
    private DAO_paciente DAO_paciente;
    DAO_paciente dao = new DAO_paciente();
     

    public Controlador_VistaPrincipal(VistaPrincipal VistaPrincipal, Modelo_Paciente Modelo_Paciente, DAO_paciente DAO_paciente){
        this.VistaPrincipal = VistaPrincipal;
        this.Modelo_Paciente = Modelo_Paciente;
        this.DAO_paciente = new DAO_paciente();
        
        //funcionalidad de los botones
        
        this.VistaPrincipal.btnGrabar.addActionListener(this);
        this.VistaPrincipal.txtIdentificacion.addActionListener(this);
        this.VistaPrincipal.btnActualizar.addActionListener(this);
        this.VistaPrincipal.btnCancelar.addActionListener(this);

    }
    
    public void iniciar(){
        VistaPrincipal.setTitle("Clinica Univalle");
        VistaPrincipal.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VistaPrincipal.btnGrabar) {
            String identificacion = VistaPrincipal.txtIdentificacion.getText();
            String nombres = VistaPrincipal.txtNombres.getText();
            String apellido = VistaPrincipal.txtApellidos.getText();
            String telefono = VistaPrincipal.txtTelefono.getText();
            String direccion = VistaPrincipal.txtDireccion.getText();

            Modelo_Paciente paciente = dao.getProducto(identificacion);
            Map<String, Modelo_Paciente> listaPacientes = dao.getListaPacientes();

            if (!identificacion.isEmpty()) {
                if (listaPacientes.containsKey(identificacion)) {
                    JOptionPane.showMessageDialog(null, "El ID " + identificacion + " ya existe");
                } else {
                    dao.registrar(identificacion, nombres, apellido, telefono, direccion);
                    JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente");
                    dao.generarTXT();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese datos válidos");
            }
        }
    }
    
}
