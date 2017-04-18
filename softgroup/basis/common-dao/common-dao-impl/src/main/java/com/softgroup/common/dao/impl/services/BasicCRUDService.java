package com.softgroup.common.dao.impl.services;

import com.softgroup.common.dao.api.entities.BaseEntity;
import com.softgroup.common.dao.impl.repositories.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by polev on 14.04.2017.
 */
public abstract class BasicCRUDService<T extends BaseEntity, R extends BasicRepository<T>>{

    @Autowired
    private R repository;

    public void save(T entity){
        repository.save(entity);
    }

    public void delete(String uuid){
        repository.delete(uuid);
    }

    public R getRepository() {
        return repository;
    }

    public T findByID(String uuid){
        return repository.findOne(uuid);
    }

    public List<T> findAll(){
        return (List<T>) repository.findAll();
    }

}
