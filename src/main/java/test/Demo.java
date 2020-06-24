package test;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;

import java.io.IOException;
import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.setGrade(4L);
        student.setId(1232);
        student.setName("DMQ");
        student.setScore(12.34);
        student.setSalary(BigDecimal.valueOf(0.5));

        Codec<Student> studentCodec = ProtobufProxy.create(Student.class);
        byte[] bytes = studentCodec.encode(student);
        System.out.println(student);
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }

        System.out.println();
        Student student2 = studentCodec.decode(bytes);
        System.out.println(student2);
        System.out.println("****************************");
    }
}
