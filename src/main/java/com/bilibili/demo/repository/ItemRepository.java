package com.bilibili.demo.repository;

import com.bilibili.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author :U-ain't
 * @version :$
 * @date :Created in 2021/3/30 1:02
 * @description :JPARepository的继承类
 * @modified By :
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
