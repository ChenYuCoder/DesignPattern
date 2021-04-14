package TemplatePattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class PythonCourse extends Course{

    @Override
    public void ppt() {
        System.out.println("准备Python PPT");
    }

    @Override
    public void teach() {
        System.out.println("Python 教学");
    }

    @Override
    public void homework() {
        System.out.println("布置Python 课后作业");
    }
}
