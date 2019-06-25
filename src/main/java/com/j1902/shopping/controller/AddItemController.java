package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.AddItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class AddItemController {
    @Autowired
    AddItemService addItemService;
    @RequestMapping("/addItem")
    public String addItem(Item item,MultipartFile file,MultipartFile file1,MultipartFile file2,MultipartFile file3) throws IOException {
        System.out.println("item = " + item);
        System.out.println("file = " + file);
        System.out.println("file = " + file1);
        System.out.println("file = " + file2);
        System.out.println("file = " + file3);

        //保存到服务器中的文件名
        String systemFileName = null;
        //服务器文件保存的位置
        String systemUploadLocation = "http://localhost:8080/upload";

        //当上传的文件不为空时
        if(!file.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = systemFileName + "-" + file.getOriginalFilename();
            //上传文件
            file.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg1(systemFileName);
        }
        if(!file1.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = systemFileName + "-" + file1.getOriginalFilename();
            //上传文件
            file1.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg2(systemFileName);
        }
        if(!file2.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = systemFileName + "-" + file2.getOriginalFilename();
            //上传文件
            file2.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg3(systemFileName);
        }
        if(!file3.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = systemFileName + "-" + file3.getOriginalFilename();
            //上传文件
            file3.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg4(systemFileName);
        }
        //修改数据库
        addItemService.addItem(item);
        return "back/goods";
    }
}
