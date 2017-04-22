package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by polev on 14.04.2017.
 */
@Entity
@Table(name = "message_status")
public class MessageStatusEntity extends BaseEntity implements Serializable {
    @Column (name = "message_ID")
    private String messageID;

    @Column (name = "message_status")
    private String messageStatus;

    @Column (name = "user_ID")
    private String userID;

    @Column (name = "conversation_ID")
    private String conversationID;

    @Column (name = "senderID")
    private String senderID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageStatusEntity)) return false;

        MessageStatusEntity that = (MessageStatusEntity) o;

        if (messageID != null ? !messageID.equals(that.messageID) : that.messageID != null) return false;
        if (messageStatus != null ? !messageStatus.equals(that.messageStatus) : that.messageStatus != null)
            return false;
        if (userID != null ? !userID.equals(that.userID) : that.userID != null) return false;
        if (conversationID != null ? !conversationID.equals(that.conversationID) : that.conversationID != null)
            return false;
        return senderID != null ? senderID.equals(that.senderID) : that.senderID == null;
    }

    @Override
    public int hashCode() {
        int result = messageID != null ? messageID.hashCode() : 0;
        result = 31 * result + (messageStatus != null ? messageStatus.hashCode() : 0);
        result = 31 * result + (userID != null ? userID.hashCode() : 0);
        result = 31 * result + (conversationID != null ? conversationID.hashCode() : 0);
        result = 31 * result + (senderID != null ? senderID.hashCode() : 0);
        return result;
    }

    public String getMessageID() {

        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }
}
