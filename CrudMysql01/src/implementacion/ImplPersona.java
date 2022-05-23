package implementacion;

import conexion.ConexionDB;
import entidades.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplPersona {
    
    ConexionDB cx= new ConexionDB();
    ArrayList<Persona> listaPersonas= new ArrayList<>();
    String sql="";
    Statement stmt= null;
    ResultSet rset=null;
    
    public void registrarPersona(Persona p){
        try {
            sql=" insert into persona (persona_nombre,persona_ap_paterno,persona_ap_materno, persona_codigo) "+
                " values('"+p.getNombre()+"','"+p.getAp_paterno()+"','"+p.getAp_materno()+"','"+p.getCodigo()+"') ";
            
            stmt=cx.conectaMysql().createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    public ArrayList<Persona> reportePersonas(){
    
        try {
            sql=" select * from persona ";
            stmt=cx.conectaMysql().createStatement();
            rset=stmt.executeQuery(sql);
            while(rset.next()){
                Persona ps = new Persona();
                ps.setId(rset.getString("persona_id"));
                ps.setNombre(rset.getString(2));
                ps.setAp_paterno(rset.getString(3));
                ps.setAp_materno(rset.getString(4));
                ps.setCodigo(rset.getString(5));
                listaPersonas.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaPersonas;
    }
}
