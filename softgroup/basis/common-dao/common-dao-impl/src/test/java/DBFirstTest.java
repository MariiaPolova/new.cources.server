import com.softgroup.common.dao.api.entities.ProfileEntity;
import com.softgroup.common.dao.api.entities.ProfileSettingsEntity;
import com.softgroup.common.dao.impl.configuration.CommonDaoAppConfig;
import com.softgroup.common.dao.impl.repositories.ProfileRepository;
import com.softgroup.common.dao.impl.repositories.ProfileSettingsRepository;
import com.softgroup.common.dao.impl.services.ProfileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by polev on 17.04.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonDaoAppConfig.class})
public class DBFirstTest {

    @Autowired
    private ProfileService profileService;

    @Test
    public void test() {
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity.setId("id");
        profileEntity.setName("test_name");
        profileService.save(profileEntity);

        ProfileSettingsEntity settingsEntity = new ProfileSettingsEntity();
        settingsEntity.setId("1");
        settingsEntity.setSettingsData("data_1");

        ProfileSettingsEntity settingsEntity1 = new ProfileSettingsEntity();
        settingsEntity1.setId("2");
        settingsEntity1.setSettingsData("data_2");

        profileService.getRepository().save(profileEntity);

        ProfileEntity profile =  profileService.getRepository().findOne("id");

        List<ProfileEntity> profileEntities =  profileService.getRepository().findByName("name_2");
    }
}

