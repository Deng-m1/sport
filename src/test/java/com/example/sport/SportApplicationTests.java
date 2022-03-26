package com.example.sport;

import com.example.sport.mapper.EasyuserMapper;
import com.example.sport.model.Permission;
import com.example.sport.model.RolesPremissions;
import com.example.sport.service.EasyuserService;
import com.example.sport.service.PermissionService;
import com.example.sport.service.RolesPremissionsService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SportApplicationTests {
    @Autowired
    EasyuserService easyuserService;
    @Autowired
    RolesPremissionsService rolesPremissionsService;
    @Autowired
    PermissionService permissionService;
    @Autowired
    EasyuserMapper easyuserMapper;

    @Test
    void contextLoads() {
        System.out.println(easyuserService.FindByUsername("ajie"));


    }
    @Test
    void contextLoads1() {
        val list = rolesPremissionsService.FindByRoleID(2);
        list.forEach(System.out::println);


    }
    @Test
    void contextLoads2() {
        List<RolesPremissions> list = rolesPremissionsService.FindByRoleID(2);
        List<Integer> Ids=new ArrayList<>();
        list.forEach(Id->{
            Ids.add(Id.getPermissionId());
        });
        val list1 = permissionService.GetPermissons(Ids);
        list1.forEach(System.out::println);


    }
    @Test
    void contextLoads3() {
        val stringList = easyuserMapper.selectPermission(2);
        /*List<RolesPremissions> list = rolesPremissionsService.FindByRoleID(2);
        List<Integer> Ids=new ArrayList<>();
        list.forEach(Id->{
            Ids.add(Id.getPermissionId());
        });
        val list1 = permissionService.GetPermissons(Ids);*/
        stringList.forEach(System.out::println);


    }
    @Test
    void contextLoads4() {
        val stringList = easyuserMapper.selectRoleFromUser(1);
        /*List<RolesPremissions> list = rolesPremissionsService.FindByRoleID(2);
        List<Integer> Ids=new ArrayList<>();
        list.forEach(Id->{
            Ids.add(Id.getPermissionId());
        });
        val list1 = permissionService.GetPermissons(Ids);*/
        System.out.println(stringList);


    }

}
