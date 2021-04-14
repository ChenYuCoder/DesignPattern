package PrototypePattern;

import java.util.List;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class Robot {
    private String name;
    private Integer height;
    private Integer weight;
    private List<String> spareParts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<String> getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(List<String> spareParts) {
        this.spareParts = spareParts;
    }

    @Override
    public String toString() {
        return "Robot{" +
          "name='" + name + '\'' +
          ", height=" + height +
          ", weight=" + weight +
          ", spareParts=" + spareParts +
          '}';
    }
}
