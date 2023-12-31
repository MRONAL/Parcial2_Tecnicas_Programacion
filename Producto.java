public class Producto {
    private String nombre;
    private String descripcion;
    private int precio;
    public String cantidadEnElinventario;

    public Producto(String nombre, String descripcion, int precio, String cantidadEnElinventario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnElinventario = cantidadEnElinventario;
    }

    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCantidadEnElinventario() {
        return cantidadEnElinventario;
    }

    public void setCantidadEnElinventario(String cantidadEnElinventario) {
        this.cantidadEnElinventario = cantidadEnElinventario;
    }
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", Descripcion=" + descripcion + ", Precio=" + precio + ", Cantidad="
                + cantidadEnElinventario;
    }
    //Complejidad O(1) Constante
}


