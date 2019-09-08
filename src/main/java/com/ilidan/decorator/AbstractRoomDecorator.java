package com.ilidan.decorator;

/**
 * 通过这个来装饰一间屋子
 */
public class AbstractRoomDecorator implements Room {

    private Room room;

    public AbstractRoomDecorator() {
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public void liveComfort() {
        this.room.liveComfort();
    }

}
