/*
// Creación de la clase java para la entidad Proyecto
*/

public class Proyecto implements Serializable {

    private int boletaProyecto;
    private String nombreProyecto;
    private String tituloProyecto;
    private String director;
    private String nombreEscuela;

    public Proyecto() {
    }

    public int getBoletaProyecto() {
        return boletaProyecto;
    }

    public void setBoletaProyecto(int boletaProyecto) {
        this.boletaProyecto = boletaProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector (int director) {
        this.director = director;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

}