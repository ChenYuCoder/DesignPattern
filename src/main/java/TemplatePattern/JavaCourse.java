package TemplatePattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class JavaCourse extends Course{

    @Override
    public void ppt() {
        System.out.println("准备Java PPT");
    }

    @Override
    public void teach() {
        System.out.println("Java 教学");
    }

    @Override
    public void homework() {
        System.out.println("布置Java 课后作业");
    }
}
