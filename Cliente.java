public class Cliente {
    private String nombreCliente;
    private String direccionDeEnvio;
    private String listaDePedidos;

    public Cliente(String nombreCliente, String direccionDeEnvio, String listaDePedidos) {
        this.nombreCliente = nombreCliente;
        this.direccionDeEnvio = direccionDeEnvio;
        this.listaDePedidos = listaDePedidos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionDeEnvio() {
        return direccionDeEnvio;
    }

    public void setDireccionDeEnvio(String direccionDeEnvio) {
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public String getListaDePedidos() {
        return listaDePedidos;
    }

    public void setListaDePedidos(String listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }
    @Override
    public String toString(){
        return "Cliente{"+"Direccion="+direccionDeEnvio+"nombre="+nombreCliente;
    }
    //O(1) constante
}
