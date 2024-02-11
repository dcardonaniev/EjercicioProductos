package me.davidlake;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];

        productos[0] = new Perecedero(
                "Pescado",
                15.0,
                3
        );
        productos[1] = new Perecedero(
                "Manzana",
                12.0,
                10
        );
        productos[2] = new NoPerecedero(
                "Atún",
                11.0,
                "Enlatado"
        );

        for(int i = 0; i < productos.length; i++) {
            System.out.printf("\n================= Producto #%d =================\n", i+1);
            System.out.printf("Precio individual: %f\n", productos[i].getPrecio());
            System.out.printf("Precio x5: %f\n", productos[i].calcular(5));
        }
    }
}

