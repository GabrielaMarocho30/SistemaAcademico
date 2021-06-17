
package capaNegocio;

import java.util.ArrayList;

public class Facultad {

    public Facultad() {
        this.nombreFacultad = "";
        this.decanoFacultad = "";
    }

    public Facultad(String nombreFacultad, String decanoFacultad) {
        this.nombreFacultad = nombreFacultad;
        this.decanoFacultad = decanoFacultad;
    }
    
    //ATRIBUTOS
    private String nombreFacultad;
    private String decanoFacultad;
    //IMPLEMENTAR MULTIPLICIDAD
    public ArrayList<EscuelaProfesional> estaEnEscuelaProfesional = new ArrayList();

    
    
    public String getNombreFacultad() {
        return nombreFacultad;
    }
    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public String getDecanoFacultad() {
        return decanoFacultad;
    }
    public void setDecanoFacultad(String decanoFacultad) {
        this.decanoFacultad = decanoFacultad;
    }
    
    //METODOS
    public String Organizar(){
        return "El método Organizar no se ha implementado";
    }
    public String Distribuir(){
        return "El método Distribuir no se ha implementado";
    }
    public String Clasificar(){
        return "El método Clasificar no se ha implementado";
    }
    public String TomarDecisiones(){
        return "El método TomarDecisiones no se ha implementado";
    }   
}
