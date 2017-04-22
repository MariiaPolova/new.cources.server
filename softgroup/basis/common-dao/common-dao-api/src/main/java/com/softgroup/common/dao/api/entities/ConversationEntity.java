package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by polev on 14.04.2017.
 */
@Entity
@Table(name = "conversation")
public class ConversationEntity extends BaseEntity implements Serializable {
    @Column (name = "type")
    private String conversationType;

    @Column (name = "name")
    private String conversationName;

    @Column (name = "last_message_ID")
    private String lastMessageID;

    @Column(name = "create_date")
    private Long createDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversationEntity)) return false;

        ConversationEntity that = (ConversationEntity) o;

        if (conversationType != null ? !conversationType.equals(that.conversationType) : that.conversationType != null)
            return false;
        if (conversationName != null ? !conversationName.equals(that.conversationName) : that.conversationName != null)
            return false;
        if (lastMessageID != null ? !lastMessageID.equals(that.lastMessageID) : that.lastMessageID != null)
            return false;
        return createDate != null ? createDate.equals(that.createDate) : that.createDate == null;
    }

    @Override
    public int hashCode() {
        int result = conversationType != null ? conversationType.hashCode() : 0;
        result = 31 * result + (conversationName != null ? conversationName.hashCode() : 0);
        result = 31 * result + (lastMessageID != null ? lastMessageID.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }

    public String getConversationType() {

        return conversationType;
    }

    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public String getConversationName() {
        return conversationName;
    }

    public void setConversationName(String conversationName) {
        this.conversationName = conversationName;
    }

    public String getLastMessageID() {
        return lastMessageID;
    }

    public void setLastMessageID(String lastMessageID) {
        this.lastMessageID = lastMessageID;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }
}
