package com.softgroup.common.dao.impl.repositories;

import com.softgroup.common.dao.api.entities.ProfileEntity;

import java.util.List;

/**
 * Created by polev on 14.04.2017.
 */
public interface ProfileRepository extends BasicRepository<ProfileEntity> {
    List<ProfileEntity> findByName(String name);

}
