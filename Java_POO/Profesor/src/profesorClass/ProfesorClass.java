package profesorClass;

/** 
 * @author jpach
 */
public class ProfesorClass {
    private String nombreCurso;
    private int cantidadHorasDia;
    private int cantidadDiasSemana;
    private String turno;
    private double precioHora;
    private String[] alumno;
    
    //Constructores

    public ProfesorClass() {
    }

    public ProfesorClass(String nombreCurso, int cantidadHorasDia, int cantidadDiasSemana, String turno, double precioHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasSemana = cantidadDiasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
    }
    
    public ProfesorClass(String[] alumno){
        this.alumno = alumno;
    }
    
    //Set y Get

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(int cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCantidadDiasSemana() {
        return cantidadDiasSemana;
    }

    public void setCantidadDiasSemana(int cantidadDiasSemana) {
        this.cantidadDiasSemana = cantidadDiasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }
    
    //toString

    @Override
    public String toString() {
        return "ProfesorClass{" + "nombreCurso=" + nombreCurso + ", cantidadHorasDia=" + cantidadHorasDia + ", cantidadDiasSemana=" + cantidadDiasSemana + ", turno=" + turno + ", precioHora=" + precioHora + ", alumno=" + alumno + '}';
    }
    
    
}
