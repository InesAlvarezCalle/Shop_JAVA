public class Libros extends Articulo{
    private String titulo;
    private String codigoAutor;
    private String isbn;

    //Constructor por defecto
    public Libros(){
        super();
        this.titulo = "";
        this.codigoAutor = "";
        this.isbn = "";
    }

    //Constructor general
    public Libros(String cod, double pre, int iva, int stc, String tit, String codA, String isbn){
        super(cod, pre, iva, stc);
        this.titulo = tit;
        this.codigoAutor = codA;
        this.isbn = isbn;
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
}
