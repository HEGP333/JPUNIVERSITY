import java.util.Date;
/**
 * 
 * @author (Heidelberg Gelvez - 1152394)
 */
public class Ayuda{
    //atributos
    private Estudiante estudiante;
    private Fecha fechaAsignacion;
    private Fecha fechaEntrega;
    private Estado estado;
    private TipoAyuda tipoAyuda;
    
    //constructor
    public Ayuda(Estudiante estudiante, Fecha fechaAsignacion, TipoAyuda tipoAyuda){
        this.estudiante = estudiante;
        this.tipoAyuda = tipoAyuda;
        this.fechaAsignacion = fechaAsignacion;
    }
    
    //getters and setters
    public Estudiante getEstudiante(){
        return estudiante;
    }
    
    public Fecha getFechaAsignacion(){
        return fechaAsignacion;
    }
    
    public Fecha getFechaEntrega(){
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
    
    public void setFechaAsignacion(Fecha fechaAsignacion){
        this.fechaAsignacion = fechaAsignacion;
    }
    
    public void setFechaEntrega(Fecha fechaEntrega){
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
        setFechaEntrega(new Fecha());
    }
    
    public void rechazar(){
        setEstado(Estado.RECHAZADO);
        setFechaEntrega(null);
    }
    
}