import org.w3c.dom.ls.LSOutput;

public class Articulo {
    private String codigo;
    private double precio;
    private int iva;
    private int stock;

    /*Constructor por defecto
    public Articulo(){
        this.codigo = "";
        this.precio = 0.0;
        this.iva = 0;
        this.stock = 0;
    }
    */

    //Contructor general
    public Articulo(String cod, double pre, int iva, int stc){
        if(cod != null && pre > 0.0 && (iva == 4 || iva == 10 || iva == 21) && stc > 0){
            this.codigo = cod;
            this.precio = pre;
            this.iva = iva;
            this.stock = stc;
        } else {
            System.out.println("\nERROR: Introduzca bien los datos");
        }
    }

    //getters and setters
    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String cod) {
        this.codigo = cod;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double pre){
        this.precio = pre;
    }

    public int getIva(){
        return this.iva;
    }

    public void setIva(int iva){
        this.iva = iva;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stc){
        this.stock = stc;
    }

    public void imprimir(){
        System.out.println("\nINFORMACIÓN DEL ARTÍCULO:");
        System.out.println("------------------------------------");
        System.out.println("Código: " + this.codigo);
        System.out.println("Precio: " + this.precio);
        System.out.println("IVA: " + this.iva);
        System.out.println("Stock: " + this.stock);
    }

    public double getPVP(){
        return (this.precio * (1 + iva / 100.0));
    }

    public double getPVPDescuento(double descuento){
        return (this.precio / (1 + descuento / 100));
    }

    public boolean vender(int ventas){
        if(ventas > this.stock){
            return false;
        } else {
            this.stock = this.stock - ventas;
            return true;
        }
    }

    public boolean almacenar(int almacen){
        if(almacen < 0){
            return false;
        } else {
            this.stock = this.stock + almacen;
            return true;
        }
    }

    public String toString(){
        return "\nInformación del artículo:\nCódigo: " + this.codigo + "\nPrecio: " + this.precio + "\nIVA: "
                + this.iva + "\nStock: " + this.stock;
    }
}
