
package capaNegocio;

import java.util.Date;

public class Asignatura {

    public Asignatura() {
        this.docenteAsignatura = "";
        this.codigoAsignatura = "";
        this.creditosAsignatura = 0;
        this.horarioAsignatura = null;
        this.categoriaAsignatura = "";
    }

    public Asignatura(String docenteAsignatura, String codigoAsignatura, int creditosAsignatura, Date horarioAsignatura, String categoriaAsignatura) {
        this.docenteAsignatura = docenteAsignatura;
        this.codigoAsignatura = codigoAsignatura;
        this.creditosAsignatura = creditosAsignatura;
        this.horarioAsignatura = horarioAsignatura;
        this.categoriaAsignatura = categoriaAsignatura;
    }
    
    //ATRIBUTOS
    private String docenteAsignatura;
    private String codigoAsignatura;
    private int creditosAsignatura;
    private Date horarioAsignatura;
    private String categoriaAsignatura;
    
    //IMPLEMENTAR MULTIPLICIDAD
    public CatalogoAsignatura perteneceCatalogoAsignatura;

    
    
    public String getDocenteAsignatura() {
        return docenteAsignatura;
    }
    public void setDocenteAsignatura(String docenteAsignatura) {
        this.docenteAsignatura = docenteAsignatura;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public int getCreditosAsignatura() {
        return creditosAsignatura;
    }
    public void setCreditosAsignatura(int creditosAsignatura) {
        this.creditosAsignatura = creditosAsignatura;
    }

    public Date getHorarioAsignatura() {
        return horarioAsignatura;
    }
    public void setHorarioAsignatura(Date horarioAsignatura) {
        this.horarioAsignatura = horarioAsignatura;
    }

    public String getCategoriaAsignatura() {
        return categoriaAsignatura;
    }
    public void setCategoriaAsignatura(String categoriaAsignatura) {
        this.categoriaAsignatura = categoriaAsignatura;
    }
    
    //METODOS
    public String Aprender(){
        return "El método Aprender no se ha implementado";
    }
    
    public String Practicar(){
        return "El método Practicar no se ha implementado";
    }
}
