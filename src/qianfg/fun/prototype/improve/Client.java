package qianfg.fun.prototype.improve;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("克隆羊");
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("kitty", 2, "黑色");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep == sheep2); // false
        System.out.println(sheep.friend == sheep2.friend);  // true,是浅拷贝
        System.out.println("sheep 的hashcode:" + sheep.hashCode() + " sheep.friend.hashcode:" + sheep.friend.hashCode());
        System.out.println("sheep2 的hashcode:" + sheep2.hashCode() + " sheep2.friend.hashcode:" + sheep2.friend.hashCode());
    }
}
