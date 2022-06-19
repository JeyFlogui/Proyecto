/*
// Creación de la clase java para la entidad Escuela
*/

public class Escuela implements Serializable {

    public Escuela (){

    }

    private String nombre;
    private String area;

        public String getNombre (){
        return nombre;
    }

    public String getNombre (String nombre){
        this.nombre=nombre;
    }

    public String getArea () {
        return area;
    }

    public void setArea (String area) {
        this.area=area;
    }

}
