package com.bilibili.demo.controller;

import com.bilibili.demo.entity.Item;
import com.bilibili.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :U-ain't
 * @version :$
 * @date :Created in 2021/3/30 1:34
 * @description :处理物品请求
 * @modified By :
 */
@RestController
@RequestMapping("/item")
public class ItemHandler {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/getAll")
    public List<Item> findAll(){
        return itemRepository.findAll();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Item> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return itemRepository.findAll(pageable);
    }

    @PostMapping("/save")
    public String save(@RequestBody Item item){
        Item result = itemRepository.save(item);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }

}
