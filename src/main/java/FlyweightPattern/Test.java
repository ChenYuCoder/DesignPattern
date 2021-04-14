package FlyweightPattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // 享元模式-结构型
        // 使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件
        // 将可共享使用的数据缓存，方便其他人使用，注意线程安全问题
        // 内部状态：共享，一般作为属性
        // 外部状态：不共享，一般作为参数
        ShapeFactory.getShape("yellow", Circle.class).show();
        ShapeFactory.getShape("yellow", Square.class).show();
        ShapeFactory.getShape("red", Circle.class).show();
        ShapeFactory.getShape("yellow", Circle.class).show();
        ShapeFactory.getShape("green", Square.class).show();
    }

}
