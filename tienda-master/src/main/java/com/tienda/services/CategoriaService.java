package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se propone la firma de un método para recuperar los 
    //registros de la tabla categoria
    public List<Categoria> getCategorias(boolean activo);
    
    //Se programa el código para obtener una Categoria
    public Categoria getCategoria(Categoria categoria);
    
    //Se actualiza o se crea un registro que tenga el mismo idCategoria
    //Si el objeto tiene un valor en idCategoria, lo busca... si lo encuentra 
    //lo actualiza si no.. lo crea...
    public void save(Categoria categoria);
    
    //Se elimina el registro que tenga el idCategoria pasado por parámetro
    public void delete(Categoria categoria); 
}

