
package capaNegocio;

import java.util.ArrayList;

public class CatalogoAsignatura {

    public CatalogoAsignatura() {
        this.totalAsignaturasdeCatalogoAsignatura = "";
        this.nombreEscuelaProfesional = "";
        this.directorEscuelaProfesional = "";
    }

    public CatalogoAsignatura(String totalAsignaturasdeCatalogoAsignatura, String nombreEscuelaProfesional, String directorEscuelaProfesional) {
        this.totalAsignaturasdeCatalogoAsignatura = totalAsignaturasdeCatalogoAsignatura;
        this.nombreEscuelaProfesional = nombreEscuelaProfesional;
        this.directorEscuelaProfesional = directorEscuelaProfesional;
    }
    
    //ATRIBUTOS
    private String totalAsignaturasdeCatalogoAsignatura;
    private String nombreEscuelaProfesional;
    private String directorEscuelaProfesional;    
    
    //IMPLEMENTAR MULTIPLICIDAD
    public ArrayList<Facultad> perteneceFacultad = new ArrayList();
    public Asignatura listaAsignatura; 

    
    
    public String getTotalAsignaturasdeCatalogoAsignatura() {
        return totalAsignaturasdeCatalogoAsignatura;
    }
    public void setTotalAsignaturasdeCatalogoAsignatura(String totalAsignaturasdeCatalogoAsignatura) {
        this.totalAsignaturasdeCatalogoAsignatura = totalAsignaturasdeCatalogoAsignatura;
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
    private String MostrarAsignaturas(){
        return "El método Mostrar Asignatura no se ha implementado";        
    }
    private String Ofrecer(){
        return "El método Ofrecer no se ha implementado";
    }
    
}
