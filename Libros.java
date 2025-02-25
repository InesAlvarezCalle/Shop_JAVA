public class Libros extends Articulo{
    private String titulo;
    private String codigoAutor;
    private String isbn;

    /*Constructor por defecto
    public Libros(){
        super();
        this.titulo = "";
        this.codigoAutor = "";
        this.isbn = "";
    }
    */

    //Constructor general
    public Libros(String cod, double pre, int iva, int stc, String tit, String codA, String isbn){
        super(cod, pre, iva, stc);
        if(tit != null && codA != null && isbn != null){
            this.titulo = tit;
            this.codigoAutor = codA;
            this.isbn = isbn;
        } else {
            System.out.println("\nERROR: Introduzca bien los datos");
        }
    }

    //Getters y Setters
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String tit){
        this.titulo = tit;
    }

    public String getCodigoAutor(){
        return this.codigoAutor;
    }

    public void setCodigoAutor(String codA){
        this.codigoAutor = codA;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    @Override
    public void imprimir(){
        System.out.println("\nINFORMACIÓN DEL LIBRO:");
        System.out.println("------------------------------------");
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("IVA: " + getIva());
        System.out.println("Stock: " + getStock());
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Código autor: " + this.codigoAutor);
        System.out.println("ISBN: " + this.isbn);
    }

    @Override
    public String toString(){
        return "\nInformación del artículo:\nCódigo: " + getCodigo() + "\nPrecio: " + getPrecio() + "\nIVA: "
                + getIva() + "\nStock: " + getStock() + "\nTítulo: " + this.titulo + "\nCódigo autor: " +
                this.codigoAutor + "\nISBN: " + this.isbn;
    }
}
