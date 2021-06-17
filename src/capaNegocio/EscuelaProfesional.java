
package capaNegocio;

import java.util.ArrayList;

public class EscuelaProfesional {

    public EscuelaProfesional() {
        this.codigoEscuelaProfesional = "";
        this.nombreEscuelaProfesional = "";
        this.directorEscuelaProfesional = "";
    }

    public EscuelaProfesional(String codigoEscuelaProfesional, String nombreEscuelaProfesional, String directorEscuelaProfesional) {
        this.codigoEscuelaProfesional = codigoEscuelaProfesional;
        this.nombreEscuelaProfesional = nombreEscuelaProfesional;
        this.directorEscuelaProfesional = directorEscuelaProfesional;
    }
    
    //ATRIBUTOS
    private String codigoEscuelaProfesional;
    private String nombreEscuelaProfesional;
    private String directorEscuelaProfesional;
    
    //IMPLEMENTAR MULTIPLICIDAD
    public ArrayList<Facultad> perteneceFacultad = new ArrayList();
    public PlanEstudio poseePlanEstudio;

    
    public String getCodigoEscuelaProfesional() {
        return codigoEscuelaProfesional;
    }
    public void setCodigoEscuelaProfesional(String codigoEscuelaProfesional) {
        this.codigoEscuelaProfesional = codigoEscuelaProfesional;
    }

    public String getNombreEscuelaProfesional() {
        return nombreEscuelaProfesional;
    }
    public void setNombreEscuelaProfesional(String nombreEscuelaProfesional) {
        this.nombreEscuelaProfesional = nombreEscuelaProfesional;
    }

    public String getDirectorEscuelaProfesional() {
        return directorEscuelaProfesional;
    }
    public void setDirectorEscuelaProfesional(String directorEscuelaProfesional) {
        this.directorEscuelaProfesional = directorEscuelaProfesional;
    }
    
    //METODOS
    public String MostrarAsignatura()
    {
        return "El método no está implementado";
    }
    public String Ofrecer()
    {
        return "El método no está implementado";
    }
    
}
