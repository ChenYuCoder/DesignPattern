package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class Test {

    public static void main(String[] args) {
        // 适配器模式-结构型
        // 将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)
        // 将A类适配（包装）成B类，使B类的使用者可以无缝使用A类
        //在2011年之前，仅仅有SD卡，手机有读取
        Phone phone = new PhoneImpl();
        System.out.println(phone.read(new SdCardImpl()));
        phone.write(new SdCardImpl(), "hello world");
        //2011年之后，新出TF卡，在不改动Phone代码的情况，兼容TF卡片，就可以使用适配器模式
        //但是如果前期抽象为ICard接口，就不需要使用适配器模式
        System.out.println(phone.read(new SdAdapter(new TfCardImpl())));
        phone.write(new SdAdapter(new TfCardImpl()), "hello world");
    }

}
