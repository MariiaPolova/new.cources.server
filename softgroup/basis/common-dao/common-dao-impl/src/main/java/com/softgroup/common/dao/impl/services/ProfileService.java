package com.softgroup.common.dao.impl.services;

import com.softgroup.common.dao.api.entities.ProfileEntity;
import com.softgroup.common.dao.impl.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by polev on 15.04.2017.
 */
@Service
public class ProfileService extends BasicCRUDService<ProfileEntity, ProfileRepository> {

    List<ProfileEntity> findByName(String name){
        return getRepository().findByName(name);
    }
}
