package qianfg.fun.prototype.deepclone;

import java.io.*;

// 分别实现clone和序列化接口
public class Sheep implements Cloneable, Serializable {
    private String name;
    private int age;
    private String color;
    public Sheep friend;   // 是对象，克隆时如何处理，默认是浅拷贝

    public String getName() {
        return name;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 方式一，使用clone()方法，单独对引用类型进行处理
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 基本数据类型直接克隆
        Sheep sheep = (Sheep) super.clone();
        // 引用数据类型需要单独处理
        if (sheep.friend != null) {
            sheep.friend = (Sheep) sheep.friend.clone();
        }
        return sheep;
    }

    /**
     * 方式2，通过对象的实例化实现（推荐）
     *
     * @return
     */
    public Object deepClone() throws Exception {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);  // 把对象以流的形式输出
        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }
}
