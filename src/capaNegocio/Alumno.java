
package capaNegocio;

public class Alumno {

    public Alumno() {
        this.apellidoAlumno = "";
        this.codigoAlumno = "";
        this.nombresAlumno = "";
        this.cicloAlumno = 0;
    }

    public Alumno(String apellidoAlumno, String codigoAlumno, String nombresAlumno, int cicloAlumno) {
        this.apellidoAlumno = apellidoAlumno;
        this.codigoAlumno = codigoAlumno;
        this.nombresAlumno = nombresAlumno;
        this.cicloAlumno = cicloAlumno;
    }
    
    //ATRIBUTOS
    private String apellidoAlumno;
    private String codigoAlumno;
    private String nombresAlumno;
    private int cicloAlumno;
    
    //IMPLEMENTAR MULTIPLICIDAD
    public CatalogoAsignatura escogeCatalogoAsignatura;

    
    public String getApellidoAlumno() {
        return apellidoAlumno;
    }
    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }
    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombresAlumno() {
        return nombresAlumno;
    }
    public void setNombresAlumno(String nombresAlumno) {
        this.nombresAlumno = nombresAlumno;
    }

    public int getCicloAlumno() {
        return cicloAlumno;
    }
    public void setCicloAlumno(int cicloAlumno) {
        this.cicloAlumno = cicloAlumno;
    }
    
    //METODOS
    public String Matricularse()
    {
        return " El metodo Matricularse no ha sido implementado";
    }
    public String Definir()
    {
        return " El metodo Definir no ha sido implementado";
    }
}