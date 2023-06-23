/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.Modelo_Paciente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franklin Aguirre
 */
public class DAO_paciente {

    private static Map<String, Modelo_Paciente> listaPacientes;

    public DAO_paciente() {
        listaPacientes = new HashMap<>();
        
    }

    public void registrar(String identificacion, String nombres, String apellido, String telefono, String direccion) {
        Modelo_Paciente paciente = new Modelo_Paciente(identificacion, nombres, apellido, telefono, direccion);
        listaPacientes.put(identificacion, paciente);
    }
     public String listar() {
        String lista = "---------- Productos ----------\n";
        for(String identificacion : listaPacientes.keySet()){
            lista += listaPacientes.get(identificacion) + "\n";
        }
        return lista;
    }
    
    public void generarTXT() {
        String archivoPersistencia = "";
        for(String identificacion: listaPacientes.keySet()){
            archivoPersistencia += listaPacientes.get(identificacion) + "\n";
        }
        try {
            FileOutputStream os = new FileOutputStream(new File("src\\PersistenciaDatos\\Paciente_Persistencia.txt"));
            os.write(archivoPersistencia.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO_paciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DAO_paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public  Modelo_Paciente getProducto(String identificacion) {
        return listaPacientes.get(identificacion);
    }
    
    public static Map<String, Modelo_Paciente> getListaPacientes() {
        return listaPacientes;
    }
     
}
