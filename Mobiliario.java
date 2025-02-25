public class Mobiliario extends Articulo {
    private String material;
    private String codigoFabric;
    private int garantia;

    /*Constructor por defecto
    public Mobiliario(){
        super();
        this.material = "";
        this.codigoFabric = "";
        this.garantia = 0;
    }
    */

    //Constructor general
    public Mobiliario(String cod, double pre, int iva, int stc, String mat, String codF, int gar){
        super(cod, pre, iva, stc);
        if(mat != null && codF != null && gar > 0){
           this.material = mat;
           this.codigoFabric = codF;
           this.garantia = gar;
       } else {
           System.out.println("\nERROR: Introduzca bien los datos");
       }
    }

    //getters and setters

    public String getMaterial(){
        return this.material;
    }

    public void setMaterial(String mat){
        this.material = mat;
    }

    public String getCodigoFabric(){
        return this.codigoFabric;
    }

    public void setCodigoFabric(String codF){
        this.codigoFabric = codF;
    }

    public int getGarantia(){
        return this.garantia;
    }

    public void setGarantia(int gar){
        this.garantia = gar;
    }

    @Override
    public void imprimir() {
        System.out.println("\nINFORMACIÓN DEL MOBILIARIO:");
        System.out.println("------------------------------------");
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("IVA: " + getIva());
        System.out.println("Stock: " + getStock());
        System.out.println("Material: " + this.material);
        System.out.println("Código fabricante: " + this.codigoFabric);
        System.out.println("Garantía: " + this.garantia);
    }

    @Override
    public String toString(){
        return "\nInformación del artículo:\nCódigo: " + getCodigo() + "\nPrecio: " + getPrecio() + "\nIVA: "
                + getIva() + "\nStock: " + getStock() + "\nMaterial: " + this.material + "\nCódigo fabricante: "
                + this.codigoFabric + "\nGarantía: " + this.garantia;
    }
}
