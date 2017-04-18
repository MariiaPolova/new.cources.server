package com.softgroup.common.dao.impl.repositories;

import com.softgroup.common.dao.api.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by polev on 14.04.2017.
 */
@NoRepositoryBean
public interface BasicRepository<T extends Serializable> extends JpaRepository<T, String> {
}
