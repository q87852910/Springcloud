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
    public Long deptNo;
    public String deptName;
    public String deptResource;

}
