package test;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
public class Student {
    @Protobuf(fieldType = FieldType.INT32, required = true, order = 1)
    private int id;
    @Protobuf(fieldType = FieldType.STRING, required = true, order = 2)
    private String name;
    @Protobuf(fieldType = FieldType.INT64, required = true, order = 3)
    private Long grade;
    @Protobuf(fieldType = FieldType.DOUBLE, required = true, order = 4)
    private double score;
    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 5)
    private BigDecimal salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
