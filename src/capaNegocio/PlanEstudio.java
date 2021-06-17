
package capaNegocio;

import java.util.ArrayList;
import java.util.Date;

public class PlanEstudio {

    public PlanEstudio() {
        this.periodoPlanEstudio = null;
        this.totalSemestrePlanEstudio = "";
        this.codigoPlanEstudio = "";
        this.categoríaPlanEstudio = "";
    }

    public PlanEstudio(Date periodoPlanEstudio, String totalSemestrePlanEstudio, String codigoPlanEstudio, String categoríaPlanEstudio) {
        this.periodoPlanEstudio = periodoPlanEstudio;
        this.totalSemestrePlanEstudio = totalSemestrePlanEstudio;
        this.codigoPlanEstudio = codigoPlanEstudio;
        this.categoríaPlanEstudio = categoríaPlanEstudio;
    }
    
    //ATRIBUTOS
    private Date periodoPlanEstudio;
    private String totalSemestrePlanEstudio;
    private String codigoPlanEstudio;
    private String categoríaPlanEstudio;
    
    //IMPLEMENTAR MULTIPLICIDAD
    public ArrayList<EscuelaProfesional> perteneceEscuelaProfesional = new ArrayList();
    public ArrayList<CatalogoAsignatura> muestraCatalogoAsignatura = new ArrayList();

    
    public Date getPeriodoPlanEstudio() {
        return periodoPlanEstudio;
    }
    public void setPeriodoPlanEstudio(Date periodoPlanEstudio) {
        this.periodoPlanEstudio = periodoPlanEstudio;
    }
    public String getTotalSemestrePlanEstudio() {
        return totalSemestrePlanEstudio;
    }

    public void setTotalSemestrePlanEstudio(String totalSemestrePlanEstudio) {
        this.totalSemestrePlanEstudio = totalSemestrePlanEstudio;
    }
    public String getCodigoPlanEstudio() {
        return codigoPlanEstudio;
    }

    public void setCodigoPlanEstudio(String codigoPlanEstudio) {
        this.codigoPlanEstudio = codigoPlanEstudio;
    }

    public String getCategoríaPlanEstudio() {
        return categoríaPlanEstudio;
    }
    public void setCategoríaPlanEstudio(String categoríaPlanEstudio) {
        this.categoríaPlanEstudio = categoríaPlanEstudio;
    }
    
    //METODOS
    public String Organizar()
    {
        return "El método no está implementado";
    }
    public String Distribuir()
    {
        return "El método no está implementado";
    }
}
