package com.sufer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User实体bean
 * @author danger
 * @date 2020/6/1 - 13:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userid;
    private String userpwd;
    private String useremail;
    private boolean usertype;

}
