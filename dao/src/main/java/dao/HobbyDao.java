package dao;

import core.model.HobbyDto;
import dao.entity.Hobby;

import java.util.List;

/**
 * Created by ����� on 04.11.2015.
 */
public interface HobbyDao {

    void addHobby(HobbyDto hobbyDto);
    List<HobbyDto> getAllHobby();
    void deleteHobby(HobbyDto hobbyDto);
}
