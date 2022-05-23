
package Modelo;

public class Venta {
    private int id;
    private int cliente;
    private String vendedor;
    private double total;
    
    public Venta(){
        
    }

    public Venta(int id, int cliente, String nombre_cli, String vendedor, double total, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   
    
}
