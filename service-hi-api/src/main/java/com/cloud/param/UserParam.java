package com.cloud.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Layne on 2018-9-11.
 */
@Data
public class UserParam implements Serializable {
    private static final long serialVersionUID = 3886036035776441219L;
    private Long id;
    private String name;
    private String sex;
}
