import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 * 
 * @author (Heidelberg Gelvez - 1152394)
 */
public class JPUniversity
{
    private List <Ayuda> ayudas;
    
    public static void main(String [] args){
       JPUniversity university = new JPUniversity();
       
       //Registrar los estudiantes
       Estudiante estudiante1 = new Estudiante("1121345", "1231245", "Pepo García", new Fecha(), TipoDocumento.CC, 1, "PepoG@gmail.com");
       Estudiante estudiante2 = new Estudiante("1124532", "1456346", "Paola Hernandez", new Fecha(), TipoDocumento.TI, 2, "PaolaH@gmail.com");
       Estudiante estudiante3 = new Estudiante("1165434", "1865443", "Henry Cortéz", new Fecha(), TipoDocumento.CC, 1, "HenryC@gmail.com");
       Estudiante estudiante4 = new Estudiante("1132563", "1876554", "Pedro Pérez", new Fecha(), TipoDocumento.CE, 2, "PedroP@gmail.com");
       Estudiante estudiante5 = new Estudiante("1154367", "1218134", "Jose Marquez", new Fecha(), TipoDocumento.TI, 2, "JoseM@gmail.com");
       //Asignar las ayudas
       Ayuda ayuda1 = new Ayuda(estudiante1, new Fecha(), TipoAyuda.COMPUTADOR);
       Ayuda ayuda2 = new Ayuda(estudiante2, new Fecha(), TipoAyuda.INTERNET);
       Ayuda ayuda3 = new Ayuda(estudiante3, new Fecha(), TipoAyuda.MERCADO);
       Ayuda ayuda4 = new Ayuda(estudiante4, new Fecha(), TipoAyuda.COMPUTADOR);
       Ayuda ayuda5 = new Ayuda(estudiante5, new Fecha(), TipoAyuda.COMPUTADOR);
       //añadir las ayudas
       university.añadirAyuda(ayuda1);
       university.añadirAyuda(ayuda2);
       university.añadirAyuda(ayuda3);
       university.añadirAyuda(ayuda4);
       university.añadirAyuda(ayuda5);
       //estado de las ayudas
       ayuda1.entregar();
       ayuda2.rechazar();
       ayuda3.entregar();
       ayuda4.entregar();
       ayuda5.rechazar();
       //contar el número de estudiantes favorecidos
       int estudiantesFavorecidos = university.contarEstudiantesFavorecidos(Estado.ENTREGADO);
       //mostrar un resúmen de Ayudas
       System.out.println("Resúmen de Ayudas:");
       System.out.println("Al Estudiante " +estudiante1.getNombre() +" se le Asignó la ayuda de " +ayuda1.getTipoAyuda() +". El estado de la ayuda es: " +ayuda1.getEstado());
       System.out.println("Al Estudiante " +estudiante2.getNombre() +" se le Asignó la ayuda de " +ayuda2.getTipoAyuda() +". El estado de la ayuda es: " +ayuda2.getEstado());
       System.out.println("Al Estudiante " +estudiante3.getNombre() +" se le Asignó la ayuda de " +ayuda3.getTipoAyuda() +". El estado de la ayuda es: " +ayuda3.getEstado());
       System.out.println("Al Estudiante " +estudiante4.getNombre() +" se le Asignó la ayuda de " +ayuda4.getTipoAyuda() +". El estado de la ayuda es: " +ayuda4.getEstado());
       System.out.println("Al Estudiante " +estudiante5.getNombre() +" se le Asignó la ayuda de " +ayuda5.getTipoAyuda() +". El estado de la ayuda es: " +ayuda5.getEstado());
       //mostrar el número de estudiantes favorecidos
       System.out.println("");
       System.out.println("Número de Estudiantes Favorecidos: " +estudiantesFavorecidos);
       
       //fin main
    }
    
    public JPUniversity() {
        ayudas = new ArrayList<>();
    }
    
    public void añadirAyuda(Ayuda ayuda) {
        ayudas.add(ayuda);
    }
    
    public int contarEstudiantesFavorecidos(Estado estado) {
        int n = 0;
        for (Ayuda ayuda : ayudas) {
            if (ayuda.getEstado() == estado) n++;
        }
        return n;
    }
    
}
