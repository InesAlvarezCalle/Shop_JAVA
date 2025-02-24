public class Oficina extends Articulo{
    private String descripcion;

    /*Contructor por defecto
    public Oficina(){
        super();
        this.descripcion = "";
    }
    */

    //Constructor general
    public Oficina(String cod, double pre, int iva, int stc, String des){
        super(cod, pre, iva, stc);
        if(des != null){
            this.descripcion = des;
            System.out.println("Constructor creado");
        } else {
            System.out.println("ERROR: Introduzca bien los datos");
        }
    }

    //getters y setters
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String des){
        this.descripcion = des;
    }
}
