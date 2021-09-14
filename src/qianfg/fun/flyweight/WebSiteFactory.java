package qianfg.fun.flyweight;

import java.util.HashMap;

/**
 * 享元工厂类，用于构建一个池容器，同时提供从池中获取对象
 */
public class WebSiteFactory {

    /**
     * 网站池，缓存共享对象
     */
    private HashMap<String, WebSite> pool = new HashMap<>();

    /**
     * 提供从池中获取对象的方法
     *
     * @param type
     * @return
     */
    public WebSite getWebSite(String type) {

        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    /**
     * 获取池内对象数量
     */
    public int getWebSiteCount() {
        return pool.size();
    }

}
