package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by polev on 14.04.2017.
 */
@Entity
public class DeviceEntity extends BaseEntity implements Serializable {
    @Column (name = "profile_ID")
    private String profile_id;

    @Column (name = "last_confirm")
    private Long lastConfirmData;

    @Column (name = "locale_code")
    private String localeCode;

    @Column(name = "device_ID")
    private String device_id; // comes from customer

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceEntity)) return false;

        DeviceEntity that = (DeviceEntity) o;

        if (profile_id != null ? !profile_id.equals(that.profile_id) : that.profile_id != null) return false;
        if (lastConfirmData != null ? !lastConfirmData.equals(that.lastConfirmData) : that.lastConfirmData != null)
            return false;
        if (localeCode != null ? !localeCode.equals(that.localeCode) : that.localeCode != null) return false;
        return device_id != null ? device_id.equals(that.device_id) : that.device_id == null;
    }

    @Override
    public int hashCode() {
        int result = profile_id != null ? profile_id.hashCode() : 0;
        result = 31 * result + (lastConfirmData != null ? lastConfirmData.hashCode() : 0);
        result = 31 * result + (localeCode != null ? localeCode.hashCode() : 0);
        result = 31 * result + (device_id != null ? device_id.hashCode() : 0);
        return result;
    }

    public String getProfile_id() {

        return profile_id;
    }

    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }

    public Long getLastConfirmData() {
        return lastConfirmData;
    }

    public void setLastConfirmData(Long lastConfirmData) {
        this.lastConfirmData = lastConfirmData;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
}
