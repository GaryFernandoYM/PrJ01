
package interfaces;

import entidades.Producto;
import java.util.ArrayList;


public interface IProductoDao {
    
    public int  registrarProducto(Producto p);
    
    public ArrayList<Producto> reporteProductos();

    public int eliminarRegistroProducto(String nombre);
    
}
