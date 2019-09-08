package com.ilidan.decorator;

/**
 *
 */
public class RoomDecoratorTest {

    public static void main(String[] args) {

        Worker worker = WorkerA.getWorker();
        Room room = new ComfortableRoom();

        WorkContext workContext = new WorkContextImpl(worker ,room);
        workContext.decorateRoom();

//        在住进屋子前，我需要放一些小花~
//        在住进屋子前，需要打扫屋子！
//        住进了一件舒服的屋子~
    }

}
