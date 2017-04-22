package com.softgroup.common.dao.impl.services;

import com.softgroup.common.dao.api.entities.MessageEntity;
import com.softgroup.common.dao.impl.repositories.MessageRepository;
import org.springframework.stereotype.Service;

/**
 * Created by polev on 15.04.2017.
 */
@Service
public class MessageService extends BasicCRUDService<MessageEntity, MessageRepository> {
}
