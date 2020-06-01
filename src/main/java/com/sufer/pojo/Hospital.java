package com.sufer.pojo;

/**
 * Hospital实体bean
 * @author danger
 * @date 2020/6/1 - 14:17
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hospital {

     private Integer hospitalid;
     private String hospitalname;
     private Integer doctornum;

}
