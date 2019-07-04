package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.AddItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class AddItemController {
    @Autowired
    AddItemService addItemService;
    @RequestMapping("/addItem")
    public String addItem(Map<String,Object> map ,Item item, MultipartFile file, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException {
        System.out.println("item = " + item);
        System.out.println("file = " + file);
        System.out.println("file = " + file1);
        System.out.println("file = " + file2);
        System.out.println("file = " + file3);

        //保存到服务器中的文件名
        String systemFileName = null;
        //服务器文件保存的位置
        String systemUploadLocation = "D:";

//        //当上传的文件不为空时
//        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
//        //上传文件名
//        String filename = UUID.randomUUID() + suffix;


        if(!file.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = "/f/"+systemFileName + "-" + file.getOriginalFilename();
            //上传文件
            file.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg1(systemFileName);
        }
        if(!file1.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = "/f/"+systemFileName + "-" + file1.getOriginalFilename();
            //上传文件
            file1.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg2(systemFileName);
        }
        if(!file2.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = "/f/"+systemFileName + "-" + file2.getOriginalFilename();
            //上传文件
            file2.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg3(systemFileName);
        }
        if(!file3.isEmpty()){
            systemFileName = UUID.randomUUID().toString();
            systemFileName = "/f/"+systemFileName + "-" + file3.getOriginalFilename();
            //上传文件
            file3.transferTo(new File(systemUploadLocation+systemFileName));
            item.setItemImg4(systemFileName);
        }
        //修改数据库
        addItemService.addItem(item);
        map.put("success","添加成功！！！");
        return "back/goods_add";
    }
    @RequestMapping("/deleteItem")
    public String deleteItem(Integer itemId){
        addItemService.deleteItem(itemId);
        return  "redirect:order";
    }
    @RequestMapping("/updateItem")
    public String deleteItem(Item item){
        addItemService.updateItem(item);
        return  "redirect:order";
    }

}
