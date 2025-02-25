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
        } else {
            System.out.println("\nERROR: Introduzca bien los datos");
        }
    }

    //getters y setters
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String des){
        this.descripcion = des;
    }

    @Override
    public void imprimir() {
        System.out.println("\nINFORMACIÓN DEL MATERIAL DE OFICINA:");
        System.out.println("------------------------------------");
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("IVA: " + getIva());
        System.out.println("Stock: " + getStock());
        System.out.println("Descripción: " + this.descripcion);
    }

    @Override
    public String toString() {
        return "\nInformación del artículo:\nCódigo: " + getCodigo() + "\nPrecio: " + getPrecio() + "\nIVA: "
                + getIva() + "\nStock: " + getStock() + "\nDescripción: " + this.descripcion;
    }
}
