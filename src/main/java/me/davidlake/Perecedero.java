package me.davidlake;

public class Perecedero extends Producto {
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public double calcular(int cantidad) {
        double precioTotal = this.precio * cantidad;

        switch (this.diasPorCaducar) {
            case 3 -> {
                precioTotal /= 2;
            }
            case 2 -> {
                precioTotal /= 3;
            }
            case 1 -> {
                precioTotal /= 4;
            }
            default -> {}
        }

        return precioTotal;
    }
}
