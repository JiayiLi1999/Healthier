package com.sufer.mapper;

import com.sufer.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserMapper
 * @author danger
 * @date 2020/6/1 - 11:50
 */
@Mapper
@Repository

public interface UserMapper {


    User selectPasswordByName(String userName, String password);
    User selectPasswordByEmail(String userEmail, String password);
    int addUser(String userName, String userEmail, String password);
}
