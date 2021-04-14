package TemplatePattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class Test {

    public static void main(String[] args) {
        // 模板模式-行为型
        // 一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
        // 模板定义流程，不注意实现
        // 子类专注实现，不需要思考流程
        Course javaCourse = new JavaCourse();
        javaCourse.open();
        Course pythonCourse = new PythonCourse();
        pythonCourse.open();
    }
}
