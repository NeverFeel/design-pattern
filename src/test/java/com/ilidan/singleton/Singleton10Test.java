package com.ilidan.singleton;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author ilidan_Y
 * @Package com.ilidan.singleton
 * @Description:
 * @date 2018/10/24
 * @Modified by:
 */
public class Singleton10Test {

    @Test
    public void testSerializable() {

        //序列化
        Singleton10 instance = Singleton10.getInstance();
        try (FileOutputStream outputStream = new FileOutputStream("singleton.obj");
             ObjectOutputStream oos = new ObjectOutputStream(outputStream)) {
            oos.writeObject(instance);
        } catch (Exception e) {
            throw new RuntimeException("序列化失败");
        }

        //反序列化
        Singleton10 instance2 = null;
        try(FileInputStream inputStream = new FileInputStream("singleton.obj");
            ObjectInputStream ois = new ObjectInputStream(inputStream)){
            instance2 = (Singleton10) ois.readObject();
        }catch (Exception e){
            throw new RuntimeException("反序列化失败");
        }

        System.out.println(instance == instance2);//true

    }

}
