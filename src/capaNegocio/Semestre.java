
package capaNegocio;

import java.util.Date;

public class Semestre {

    public Semestre() {
        this.año = null;
        this.Codigo = "";
        this.matricula = "";
        this.periodoMatricula = null;
    }

    public Semestre(Date año, String Codigo, String matricula, Date periodoMatricula) {
        this.año = año;
        this.Codigo = Codigo;
        this.matricula = matricula;
        this.periodoMatricula = periodoMatricula;
    }
    
    //ATRIBUTOS
    private Date año;
    private String Codigo;
    private String matricula;
    private Date periodoMatricula;    
    
    //IMPLEMENTAR MULTIPLICIDAD
    public CatalogoAsignatura defineCatalogoAsignatura;

    
    public Date getAño() {
        return año;
    }
    public void setAño(Date año) {
        this.año = año;
    }

    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getPeriodoMatricula() {
        return periodoMatricula;
    }
    public void setPeriodoMatricula(Date periodoMatricula) {
        this.periodoMatricula = periodoMatricula;
    }
    
    //METODOS
    public String Organizar(){
        return "El método Organizar no se ha implementado";
    }
    public String Matricular(){
        return "El método Matricular no se ha implementado";    
    }
    
    
}
