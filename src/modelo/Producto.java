package modelo;

Public class Producto{

    private String Nombre;
    private String Sku;
    private int cantidad;
    private double Precio;

    public Producto(String Nombre, String Sku, int cantidad, double Precio){
       this.nombre = nombre;
        this.sku = sku;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public String getSku() { return sku; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "SKU: " + sku + " | Nombre: " + nombre + 
               " | Cantidad: " + cantidad + " | Precio: $" + precio;
            }
}

   