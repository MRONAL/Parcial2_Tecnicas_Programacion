import java.util.LinkedList;
public class Pedido {
    LinkedList<Producto>productosDisponibles=new LinkedList<>();
    public void registrarProducto(Producto producto){
        productosDisponibles.add(producto);
    }
    public Producto buscarProducto(String nombre){
        for(int i=0;i<productosDisponibles.size();i++){
            Producto productoBuscado=productosDisponibles.get(i);
            if(productoBuscado.getNombre().equals(nombre)){
                return productoBuscado;
            }
        }
        return null;
    }
    public LinkedList<Producto>mostrarProductosDisponibles(){
        return productosDisponibles;
    }
    //Complejidad temporal O(N) Lineal
}
