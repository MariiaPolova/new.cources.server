package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by polev on 14.04.2017.
 */
@Entity
@Table(name = "message")
public class MessageEntity extends BaseEntity implements Serializable {
    @Column(name = "senderID")
    private String senderID;

    @Column(name = "conversation_ID")
    private String conversationID;

    @Column(name = "payload")
    private String payload;

    @Column(name = "message_type")
    private String messageType;

    @Column(name = "create_date")
    private Long createDate;

    @Column(name = "server_date")
    private Long serverReceiveDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;

        MessageEntity that = (MessageEntity) o;

        if (senderID != null ? !senderID.equals(that.senderID) : that.senderID != null) return false;
        if (conversationID != null ? !conversationID.equals(that.conversationID) : that.conversationID != null)
            return false;
        if (payload != null ? !payload.equals(that.payload) : that.payload != null) return false;
        if (messageType != null ? !messageType.equals(that.messageType) : that.messageType != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        return serverReceiveDate != null ? serverReceiveDate.equals(that.serverReceiveDate) : that.serverReceiveDate == null;
    }

    @Override
    public int hashCode() {
        int result = senderID != null ? senderID.hashCode() : 0;
        result = 31 * result + (conversationID != null ? conversationID.hashCode() : 0);
        result = 31 * result + (payload != null ? payload.hashCode() : 0);
        result = 31 * result + (messageType != null ? messageType.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (serverReceiveDate != null ? serverReceiveDate.hashCode() : 0);
        return result;
    }

    public String getSenderID() {

        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getServerReceiveDate() {
        return serverReceiveDate;
    }

    public void setServerReceiveDate(Long serverReceiveDate) {
        this.serverReceiveDate = serverReceiveDate;
    }
}
