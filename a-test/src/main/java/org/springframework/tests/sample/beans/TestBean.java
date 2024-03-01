package org.springframework.tests.sample.beans;

/**
 * @author huxianghao
 * @date 2024/3/1 4:34 PM
 */
public class TestBean {
    private String name;

    public TestBean() {
    }

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
