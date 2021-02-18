package com.xiang.springcloud.Service;

import com.xiang.pojo.Dept;
import com.xiang.springcloud.dao.DeptDao;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept getDeptById(Long id) {
        return deptDao.getDeptById(id);
    }

    public List<Dept> getAllDept() {
        return deptDao.getAllDept();
    }

    public void updatePassWord() {
        //查询所有用户
        List<Map> result= deptDao.updatePassWord();
        List<Map<String,String>> list=new ArrayList<Map<String, String>>();
        if (result!=null) {
            for (Map map : result) {
                Map<String,String> param=new HashMap<String, String>();
                String userId=map.get("userId").toString();
                String salt = RandomStringUtils.randomAlphanumeric(20);
                param.put("userId",userId);
                param.put("salt",salt);
                String password= new Sha256Hash("wangting", salt).toHex();
                param.put("password",password);
                list.add(param);
            }
        }
        //更新
        try {
            deptDao.updateInfo(list);
        }catch (Exception e){
            for (int i=0;i<list.size();i++){
                Map<String,String> map=list.get(i);
                deptDao.updateInfoBySing(map);
            }
        }


    }
}
