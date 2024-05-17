import java.util.Date;
/**
 * 
 * @author (Heidelberg Gelvez - 1152394)
 */
public class Estudiante{
    //atributos
    private String codigo;
    private String documento;
    private String nombre;
    private Date fechaNacimiento;
    private TipoDocumento tipoDocumento;
    private int estrato;
    private String email;
    
    //constructor
    public Estudiante(String codigo, String documento, String nombre, Date fechaNacimiento, TipoDocumento tipoDocumento, int estrato, String email){
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
        this.estrato = estrato;
        this.email = email;
    }
    
    //getters and setters
    public String getCodigo(){
        return codigo;
    }
    
    public String getDocumento(){
        return documento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public TipoDocumento tipoDocumento(){
        return tipoDocumento;
    }
    
    public int getEstrato(){
        return estrato;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setDocumento(String documento){
        this.documento = documento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setTipoDocumento(TipoDocumento tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }
    
    public void setEstrato(int estrato){
        this.estrato = estrato;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}