package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by polev on 10.04.2017.
 */
@Entity
@Table(name = "profile_settings")
public class ProfileSettingsEntity extends BaseEntity implements Serializable {

    @Column(name = "settings_data")
    private String settingsData;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfileSettingsEntity)) return false;

        ProfileSettingsEntity that = (ProfileSettingsEntity) o;

        return settingsData != null ? settingsData.equals(that.settingsData) : that.settingsData == null;
    }

    @Override
    public int hashCode() {
        return settingsData != null ? settingsData.hashCode() : 0;
    }

    public String getSettingsData() {

        return settingsData;
    }

    public void setSettingsData(String settingsData) {
        this.settingsData = settingsData;
    }
}
