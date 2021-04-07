package com.bilibili.demo;

import com.bilibili.demo.entity.Item;
import com.bilibili.demo.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void contextLoads() {
        System.out.println(itemRepository.findAll());
    }

    @Test
    void save(){
        Item item = new Item();
        item.setName("item3");
        System.out.println(itemRepository.save(item));
    }

}
