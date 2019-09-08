package com.ilidan.decorator;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public  class WorkContextImpl implements WorkContext {

    private Worker worker;
    private Room targetRoom;

    public WorkContextImpl(Worker worker, Room targetRoom) {
        Objects.requireNonNull(worker);
        Objects.requireNonNull(targetRoom);
        this.worker = worker;
        this.targetRoom = targetRoom;
    }

    public Worker getWorker() {
        return worker;
    }

    @Override
    public Room getTargetRoom() {
        return targetRoom;
    }

    @Override
    public List<AbstractRoomDecorator> getRoomDecorators() {
        return worker.getRoomDecorators();
    }

    public void decorateRoom() {
        Room room = targetRoom;
        List<AbstractRoomDecorator> roomDecorators = worker.getRoomDecorators();
        Iterator<AbstractRoomDecorator> roomDecoratorIterator = roomDecorators.iterator();
        while (roomDecoratorIterator.hasNext()) {
            AbstractRoomDecorator roomDecorator = roomDecoratorIterator.next();
            roomDecorator.setRoom(room);
            room = roomDecorator;
        }
        room.liveComfort();
    }

}
