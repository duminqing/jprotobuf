package com.github.duminqing.bigdecimal;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
public class BigDecimalPojo {

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 1)
    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
