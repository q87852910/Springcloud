package com.xiang.springcloud.Controller;

import com.xiang.pojo.Dept;
import com.xiang.springcloud.Service.DeptService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("/addDept")
    public boolean addDept(Dept dept){

        return deptService.addDept(dept);

    }

    @RequestMapping("/queryAll")
    public List<Dept> queryAll(){

        return deptService.getAllDept();

    }
    @RequestMapping("/queryById")
    public Dept queryById(Long id){

        return deptService.getDeptById(id);

    }


   @RequestMapping("/password")
   public void setPassWord(){
       deptService.updatePassWord();
    }

   public static void main(String[] args) {
       String salt = RandomStringUtils.randomAlphanumeric(20);
       String salt1 = new Sha256Hash("user100").toHex();
       String salt2 = new Sha256Hash("user100", salt).toHex();
       System.out.println(salt);
       System.out.println(salt1);
       System.out.println(salt2);


   }

}

