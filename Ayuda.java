import java.util.Date;
/**
 * 
 * @author (Heidelberg Gelvez - 1152394)
 */
public class Ayuda{
    //atributos
    private Estudiante estudiante;
    private Date fechaAsignacion;
    private Date fechaEntrega;
    private Estado estado;
    private TipoAyuda tipoAyuda;
    
    //constructor
    public Ayuda(Estudiante estudiante, Date fechaAsignacion, TipoAyuda tipoAyuda){
        this.estudiante = estudiante;
        this.tipoAyuda = tipoAyuda;
        this.fechaAsignacion = fechaAsignacion;
    }
    
    //getters and setters
    public Estudiante getEstudiante(){
        return estudiante;
    }
    
    public Date getFechaAsignacion(){
        return fechaAsignacion;
    }
    
    public Date getFechaEntrega(){
        return fechaEntrega;
    }
    
    public Estado getEstado(){
        return estado;
    }
    
    public TipoAyuda getTipoAyuda(){
        return tipoAyuda;
    }
    
    public void setEstudiante(Estudiante estudiante){
        this.estudiante = estudiante;
    }
    
    public void setFechaAsignacion(Date fechaAsignacion){
        this.fechaAsignacion = fechaAsignacion;
    }
    
    public void setFechaEntrega(Date fechaEntrega){
        this.fechaEntrega = fechaEntrega;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public void setTipoAyuda(TipoAyuda tipoAyuda){
        this.tipoAyuda = tipoAyuda;
    }
    
    //métodos
    public void entregar(){
        setEstado(Estado.ENTREGADO);
        setFechaEntrega(new Date());
    }
    
    public void rechazar(){
        setEstado(Estado.RECHAZADO);
        setFechaEntrega(null);
    }
    
}