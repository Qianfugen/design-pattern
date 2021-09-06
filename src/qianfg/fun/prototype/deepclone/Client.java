package qianfg.fun.prototype.deepclone;

/**
 * 深拷贝2种实现方式：
 * 1.重写clone()方法；
 * 2.对象序列化
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("深拷贝-方式1，重写clone()方法");
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("kitty", 2, "黑色");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep == sheep2); // false
        System.out.println(sheep.friend == sheep2.friend);  // false,是深拷贝
        System.out.println("sheep 的hashcode:" + sheep.hashCode() + " sheep.friend.hashcode:" + sheep.friend.hashCode());
        System.out.println("sheep2 的hashcode:" + sheep2.hashCode() + " sheep2.friend.hashcode:" + sheep2.friend.hashCode());

        System.out.println("深拷贝-方式2，对象序列化");
        Sheep deepSheep = new Sheep("tom", 1, "白色");
        deepSheep.friend = new Sheep("kitty", 2, "黑色");
        Sheep cloneSheep = (Sheep) deepSheep.deepClone();
        System.out.println(deepSheep);
        System.out.println(cloneSheep);
        System.out.println(deepSheep == cloneSheep);    //false
        System.out.println(deepSheep.friend == cloneSheep.friend);  //false，是深拷贝
        System.out.println("deepSheep 的hashcode:" + deepSheep.hashCode() + " deepSheep.friend.hashcode:" + deepSheep.friend.hashCode());
        System.out.println("cloneSheep 的hashcode:" + cloneSheep.hashCode() + " cloneSheep.friend.hashcode:" + cloneSheep.friend.hashCode());
    }
}
