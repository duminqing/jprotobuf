package com.github.duminqing.bigdecimal;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    public void testBigDecimalPojo() throws IOException {
        BigDecimalPojo pojo1 = new BigDecimalPojo();
        pojo1.setSalary(new BigDecimal("99.99"));
        Codec<BigDecimalPojo> codec = ProtobufProxy.create(BigDecimalPojo.class);
        byte[] bytes = codec.encode(pojo1);
        BigDecimalPojo pojo2 = codec.decode(bytes);
        Assert.assertEquals(pojo2.getSalary().toString(), pojo1.getSalary().toString());
    }
}
