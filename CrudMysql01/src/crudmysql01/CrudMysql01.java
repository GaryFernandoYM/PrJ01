package crudmysql01;

import conexion.ConexionDB;
import entidades.Persona;
import implementacion.ImplPersona;


public class CrudMysql01 {
    public static void main(String[] args) {
        ImplPersona ip= new ImplPersona();
        Persona ps= new Persona();
        ps.setNombre("Efrain");
        ps.setAp_paterno("Hancco");
        ps.setAp_materno("Mullisaca");
        ps.setCodigo("12345");
        
        ip.registrarPersona(ps);
        
        
        for(Persona d : ip.reportePersonas()){
        System.out.println(d.getId()+"  "+d.getNombre()+" "+d.getAp_paterno());
        }
        
    }    
}
