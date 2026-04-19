public class Sistema {

    public void ejecutar(){
        Factura caso1 = new Factura("A156", "Tornillos", 25, 7.59);
        Factura caso2 = new Factura("B6789", "Taladro", -3, 38.56);
        Factura caso3 = new Factura("C3200", "Pintura", 4, -12.50);
        Factura caso4 = new Factura("D0042", "Sierra", 0, 0.0);

        System.out.println("=== CASO 1: DATOS VALIDOS ===");
        System.out.println(caso1);

        System.out.println("\n=== CASO 2: CANTIDAD INVALIDA (DEBE QUEDAR EN 0) ===");
        System.out.println(caso2);

        System.out.println("\n=== CASO 3: PRECIO INVALIDO (DEBE QUEDAR EN 0.0) ===");
        System.out.println(caso3);

        System.out.println("\n=== CASO 4: CANTIDAD Y PRECIO INVALIDOS ===");
        System.out.println(caso4);

        caso1.setCantidad(-10);
        caso1.setPrecio(-5.0);
        System.out.println("\n=== CASO 5: SETTERS INVALIDOS SOBRE CASO 1 ===");
        System.out.println(caso1);

        caso1.setCantidad(3);
        caso1.setPrecio(10.0);
        System.out.println("\n=== CASO 6: SETTERS VALIDOS SOBRE CASO 1 ===");
        System.out.println(caso1);
    }
}
