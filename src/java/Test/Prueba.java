/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementarn;
import Model.Categoria;
import java.util.List;


/**
 *
 * @author Palacios
 */
public class Prueba {
    public static void main(String[] args) {
        Prueba evaluar = new Prueba();
        evaluar.listarCategorias();
    }

    private void listarCategorias() {
       CategoriaDAO categoria = new CategoriaDAOImplementarn(); //To change body of generated methods, choose Tools | Templates.
       List<Categoria> listar = categoria.Listar();
        System.out.println("LISTADO DE CATEGORIAS");
        for ( Categoria categoriaListar : listar) {
            System.out.println("ID: "+categoriaListar.getId_categoria()
            + " NOMBRE: "+ categoriaListar.getNom_categoria()
            + " ESTADO: "+categoriaListar.getEstado_categoria());
        }
    }
    
}
