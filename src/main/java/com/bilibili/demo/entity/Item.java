package com.bilibili.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author :U-ain't
 * @version :$
 * @date :Created in 2021/3/30 0:59
 * @description :bilibili 4小时学会SpringBoot+Vue前后端分离开发
 * @modified By :
 */

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
