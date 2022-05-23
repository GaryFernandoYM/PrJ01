package implementacion;

import conexion.ConexionDB;
import entidades.Persona;
import entidades.Producto;
import generator.generator;
import interfaces.IProductoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ImplDaoProducto   implements IProductoDao {
    
    ConexionDB cx= new ConexionDB();
    
    ArrayList<Producto> listaProductos= new ArrayList<>();
    String sql="";
    String query="";
    Statement stmt= null;
    ResultSet rset=null;    
    public int  registrarProducto(Producto p){
        int i=0;
        generator gn= new generator();
        String idproducto=gn.generadorId();
        try {
           /* query=" insert into productos_id (producto_id,producto_nombre,producto_marca,producto_modelo,producto_precio,producto_stock) "+
                  " values('"+idproducto+"','"+p.getNombre()+"','"+p.getMarca()+"','"+p.getModelo()+"','"+p.getPrecio()+"','"+p.getStock()+"') "; */
            
            query=" insert into producto(id,nombre,marca,modelo,precio,stock) "+
                  " values('"+idproducto+"','"+p.getNombre()+"','"+p.getMarca()+"','"+p.getModelo()+"','"+p.getPrecio()+"','"+p.getStock()+"') ";            
            
            System.out.println("consulta:::::::"+query);
            stmt= cx.conectaMysql().createStatement();
            i   = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage()); 
        }        
        
        return i;
    }
    
    @Override
    public ArrayList<Producto> reporteProductos(){
        try {
            sql=" select * from producto ";
            System.out.println("www"+sql);
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            while(rset.next()){
                Producto ps = new Producto();
                ps.setId(rset.getString("id"));
                ps.setNombre(rset.getString("nombre"));
                ps.setMarca(rset.getString("marca"));
                ps.setModelo(rset.getString("modelo"));
                ps.setPrecio(rset.getDouble("precio"));
                ps.setStock(rset.getInt("stock"));
                
                listaProductos.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaProductos;
        
   
    }
    public int eliminarRegistroProducto(String nombre){
        
        int i=0;
        try {
            sql=" delete from producto where nombre='"+nombre+"' ";
            stmt=cx.conectaMysql().createStatement();
            i=stmt.executeUpdate(sql);
            System.out.println("Se elimino el registro");
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;
    }
   public int actualizarRegistroProducto(Producto p){
        
        int i=0;
        try {
            sql=" update  producto " +
                " set nombre='"+p.getNombre()+"', marca='"+p.getMarca()+"', modelo='"+p.getModelo()+"', precio='"+p.getPrecio()+"', stock='"+p.getStock()+"' " +
                " where id  ='"+p.getId()+"' ";
            stmt=cx.conectaMysql().createStatement();
            i=stmt.executeUpdate(sql);
            
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return i;
        
    } 
    
}
