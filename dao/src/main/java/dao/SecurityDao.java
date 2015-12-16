package dao;

import core.model.HobbyDto;
import core.model.SecurityDto;

import java.util.List;

/**
 * Created by Администратор on 15.12.15.
 */
public interface SecurityDao {

    void addSecurity(SecurityDto securityDto);
    List<SecurityDto> getAllSecurity();
    void deleteSecurity(SecurityDto securityDto);
}
