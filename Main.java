public class Main {
    public static void main(String[] args) {
        Articulo[] articulos = new Articulo[4];
        int n, opcion;
        double descuento;

        Articulo articulo1 = new Articulo(Leer.leerTexto("Introduce el código del artículo: "),
            Leer.leerDouble("Introduce el precio del artículo: "),
            Leer.leerEntero("Introduce el IVA del artículo: "),
            Leer.leerEntero("Introduce la cantidad en stock: "));
        System.out.println();

        Libros libro1 = new Libros(Leer.leerTexto("Introduce el código del libro: "),
                Leer.leerDouble("Introduce el precio del libro: "),
                Leer.leerEntero("Introduce el IVA del libro: "),
                Leer.leerEntero("Introduce la cantidad en stock: "),
                Leer.leerTexto("Introduce el título del libro: "),
                Leer.leerTexto("Introduce el código de autor: "),
                Leer.leerTexto("Introduce el ISBN del libro: "));
        System.out.println();

        Mobiliario mobiliario1 = new Mobiliario(Leer.leerTexto("Introduce el código del mobiliario: "),
        Leer.leerDouble("Introduce el precio del mobiliario: "),
                Leer.leerEntero("Introduce el IVA del mobiliario: "),
                Leer.leerEntero("Introduce la cantidad en stock: "),
                Leer.leerTexto("Introduce el materíal del mobiliario: "),
                Leer.leerTexto("Introduce el código del fabricante: "),
                Leer.leerEntero("Introduce los años de garantía: "));
        System.out.println();

        Oficina oficina1 = new Oficina(Leer.leerTexto("Introduce el código del producto de la oficina: "),
                Leer.leerDouble("Introduce el precio  del producto de la oficina: "),
                Leer.leerEntero("Introduce el IVA  del producto de la oficina: "),
                Leer.leerEntero("Introduce la cantidad en stock: "),
                Leer.leerTexto("Introduce la descripción del producto de la oficina: "));
        System.out.println();

        articulos[0] = articulo1;
        articulos[1] = libro1;
        articulos[2] = mobiliario1;
        articulos[3] = oficina1;

        System.out.println("------------------------------------");
        System.out.println("IMPRIMIMOS CON MÉTODO IMPRIMIR");
        System.out.println("------------------------------------");
        articulo1.imprimir();
        libro1.imprimir();
        mobiliario1.imprimir();
        oficina1.imprimir();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("------------------------------------");
        System.out.println("IMPRIMIMOS CON MÉTODO toString");
        System.out.println("------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(articulos[i]);
        }
        System.out.println("------------------------------------");
        System.out.println();

        // VENDER ARTÍCULOS
        System.out.println("\n1.Artículo     2.Libro     3.Mobiliario     4.Oficina");

        opcion = Leer.leerEntero("Introduce la opción que desea seleccionar: ");
        n = Leer.leerEntero("Introduce la cantidad de productos a vender: ");

        if(opcion == 1){
            if (articulo1.vender(n)){
                articulo1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido vender");
            }
        } else if (opcion == 2) {
            if (libro1.vender(n)){
                libro1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido vender");
            }
        } else if (opcion == 3) {
            if (mobiliario1.vender(n)){
                mobiliario1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido vender");
            }
        } else if (opcion == 4) {
            if (oficina1.vender(n)){
                oficina1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido vender");
            }
        } else {
            System.out.println("\nERROR: Valor introducido incorrecto\n");
        }

        // ALMACENAR ARTÍCULOS
        System.out.println("\n1.Artículo     2.Libro     3.Mobiliario     4.Oficina");

        opcion = Leer.leerEntero("Introduce la opción que desea seleccionar: ");
        n = Leer.leerEntero("Introduce la cantidad de productos a almacenar: ");

        if(opcion == 1){
            if (articulo1.almacenar(n)){
                articulo1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido almacenar");
            }
        } else if (opcion == 2) {
                if (libro1.almacenar(n)){
                    libro1.imprimir();
                } else {
                    System.out.println("ERROR: No se ha podido almacenar");
                }
        } else if (opcion == 3) {
            if (mobiliario1.almacenar(n)){
                 mobiliario1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido almacenar");
            }
        } else if (opcion == 4) {
            if (oficina1.almacenar(n)){
                oficina1.imprimir();
            } else {
                System.out.println("ERROR: No se ha podido almacenar");
            }
        } else {
            System.out.println("\nERROR: Valor introducido incorrecto\n");
        }

        // RECORRER ARRAY Y MOSTRAR PVP (precio de venta y precio de venta con descuento)
        for (int i = 0; i < 4; i++) {
            descuento = Leer.leerDouble("\nIntroduce el descuento: \n");
            System.out.println("Artículo " + i + ": ");
            articulos[i].imprimir();
            articulos[i].getPVP();
            articulos[i].getPVPDescuento(descuento);
        }

    }
}