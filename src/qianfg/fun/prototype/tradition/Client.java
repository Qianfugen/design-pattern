package qianfg.fun.prototype.tradition;

public class Client {
    public static void main(String[] args) {
        System.out.println("克隆羊");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep == sheep2); // false
        System.out.println("sheep 的hashcode:" + sheep.hashCode());
        System.out.println("sheep2 的hashcode:" + sheep2.hashCode());
    }
}
