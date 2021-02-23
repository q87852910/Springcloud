package com.xiang.springcloud.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiang.pojo.Dept;
import com.xiang.springcloud.Service.DeptService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @HystrixCommand(fallbackMethod = "Hystrix")
    public Dept queryById(Long id){
        Dept dept=deptService.getDeptById(id);
        if(dept==null){
            throw  new RuntimeException("id不存在");
        }
        return dept;

    }

    public Dept Hystrix(Long id){
       return new Dept().setDeptName("当前id不存在").setDeptResource("没有数据库");
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

