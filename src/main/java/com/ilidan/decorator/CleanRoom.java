package com.ilidan.decorator;

/**
 * 打扫房间
 */
public class CleanRoom extends AbstractRoomDecorator {
    public CleanRoom() {
    }

    @Override
    public void liveComfort() {
        this.cleanRoom();
        super.liveComfort();
    }

    private void cleanRoom(){
        System.out.println("在住进屋子前，需要打扫屋子！");
    }

}
