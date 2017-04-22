package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by polev on 14.04.2017.
 */
@Entity
@Table(name = "conversation_member")
public class ConversationMemberEntity extends BaseEntity implements Serializable {
    @Column(name = "profile_ID")
    private String profileID;

    @Column(name = "conversation_ID")
    private String conversationID;

    @Column(name = "member_status")
    private Boolean memberStatus;

    @Column(name = "join_date")
    private Long joinDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversationMemberEntity)) return false;

        ConversationMemberEntity that = (ConversationMemberEntity) o;

        if (profileID != null ? !profileID.equals(that.profileID) : that.profileID != null) return false;
        if (conversationID != null ? !conversationID.equals(that.conversationID) : that.conversationID != null)
            return false;
        if (memberStatus != null ? !memberStatus.equals(that.memberStatus) : that.memberStatus != null) return false;
        return joinDate != null ? joinDate.equals(that.joinDate) : that.joinDate == null;
    }

    @Override
    public int hashCode() {
        int result = profileID != null ? profileID.hashCode() : 0;
        result = 31 * result + (conversationID != null ? conversationID.hashCode() : 0);
        result = 31 * result + (memberStatus != null ? memberStatus.hashCode() : 0);
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        return result;
    }

    public String getProfileID() {

        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public Boolean getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Boolean memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Long joinDate) {
        this.joinDate = joinDate;
    }
}
