package qianfg.fun.flyweight;

/**
 * 享元模式提出两个要求：细粒度和共享对象。即将对象的信息分为两个部分：内部状态和外部状态
 * 内部状态：对象共享出来的信息，存储在享元对象内部且不随环境而改变
 * 外部状态：对象得以依赖的一个标记，随环境而改变，不可共享
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("享元模式");
        WebSiteFactory factory = new WebSiteFactory();

        WebSite weibo = factory.getWebSite("微博");
        weibo.use(new User("Tom"));

        WebSite weixin = factory.getWebSite("微信公众号");
        weixin.use(new User("Jack"));

        WebSite news = factory.getWebSite("新闻");
        news.use(new User("Smith"));

        WebSite weibo2 = factory.getWebSite("微博");
        weibo2.use(new User("John"));

        WebSite weibo3 = factory.getWebSite("微博");
        weibo3.use(new User("Jerry"));

        System.out.println("网站池现有对象个数：" + factory.getWebSiteCount());


    }
}
