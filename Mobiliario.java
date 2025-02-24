public class Mobiliario extends Articulo {
    private String material;
    private String codigoFabric;
    private int garantia;

    //Constructor por defecto
    public Mobiliario(){
        super();
        this.material = "";
        this.codigoFabric = "";
        this.garantia = 0;
    }

    //Constructor general
    public Mobiliario(String cod, double pre, int iva, int stc, String mat, String codF, int gar){
        super(cod, pre, iva, stc);
        this.material = mat;
        this.codigoFabric = codF;
        this.garantia = gar;
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
}
