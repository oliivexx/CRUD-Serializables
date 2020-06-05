/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class ClaseTest {
    public static ArrayList<Instituto> institutos = new ArrayList();
    public static ArrayList<Profesor> profesores = new ArrayList();
    
    
    public void añadirInstituto(){
        Instituto inst = new Instituto("Cristo Rey", "Granada", "San Gregorio");
        institutos.add(inst);
    }
    
    public void añadirProfesor(){
        Profesor profe = new Profesor("Jaime", "Matas", "687236487H");
        profesores.add(profe);
    }
}
