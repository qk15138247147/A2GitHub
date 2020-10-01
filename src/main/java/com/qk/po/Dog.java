package com.qk.po;

/**
 * @author samasung
 * @create 2020-10-01-8:54
 */
public class Dog {
      private int  id;
      private String name;
      private int love;
      private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", love=" + love +
                ", type='" + type + '\'' +
                '}';
    }
}
