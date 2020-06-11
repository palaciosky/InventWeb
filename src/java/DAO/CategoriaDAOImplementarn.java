/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import java.util.List;
import Factory.FactoryConexionDB;
import Factory.ConexionDB;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Palacios
 */
public class CategoriaDAOImplementarn implements CategoriaDAO {

    ConexionDB conn;
    
    public CategoriaDAOImplementarn() {
        //Definir a la db que se conectara por default
        this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        
    }

    
    
    @Override
    public List<Categoria> Listar() {
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_categoria;");
        List<Categoria> lista = new ArrayList<Categoria>();
        try{
            //Se crea el objeto ResultSet omplemantando el metodo ConsultaSQL 
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
            Categoria categoria = new Categoria();//Declara el objeto categoria
            //Asigna a cada campo consultado al atributo de la clase
            categoria.setId_categoria(resultadoSQL.getInt("id_categoria"));
            categoria.setNom_categoria(resultadoSQL.getString("nom_categoria"));
            categoria.setEstado_categoria(resultadoSQL.getInt("estado_categoria"));
            lista.add(categoria);//Agrega al arreglo cada registro encontrado
            }
        }catch(Exception ex){
        this.conn.cerrarConexion();//pa cerrar conexion señores
        }
        return lista;
    }

    @Override
    public List<Categoria> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria editarCat(int id_cat_edit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarCat(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarCat(int id_cat_edit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
