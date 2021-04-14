package TemplatePattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public abstract class Course {

    /**
     * 准备PPT课件
     */
    public abstract void ppt();

    /**
     * 讲课
     */
    public abstract void teach();

    /**
     * 课后作业
     */
    public abstract void homework();

    /**
     * 开课
     */
    public final void open() {
        ppt();
        teach();
        homework();
    }
}
