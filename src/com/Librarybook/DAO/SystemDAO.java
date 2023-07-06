/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import java.util.List;

/**
 *
 * @author user
 */
public abstract class SystemDAO<E, K> {

    abstract public void insert(E entity);

    abstract public void update(E entity);

    abstract public void delete(K id);

    abstract public List<E> selectAll();

    abstract public E selectById(K id);

    abstract protected List<E> selectBySql(String sql, Object... args);
}
