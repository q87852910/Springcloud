package com.xiang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true) //链式写法
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    private String deptResource;

}
