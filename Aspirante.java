/*
// Creación de la clase java para la entidad Aspirante
*/

public class Aspirante implements Serializable {

    private int boletaAspirante;
    private String nombre;
    private String paterno;
    private String materno;
    private String email;
    private String curriculum;
    private int boletaProyecto;

    public Aspirante() {
    }

    public int getBoletaAspirante() {
        return boletaAspirante;
    }

    public void setBoletaAspirante(int boletaAspirante) {
        this.boletaAspirante = boletaAspirante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum (String curriculum) {
        this.curriculum = curriculum;
    }

    public int getBoletaProyecto() {
        return boletaProyecto;
    }

    public void setBoletaProyecto(int boletaProyecto) {
        this.boletaProyecto = boletaProyecto;
    }

}