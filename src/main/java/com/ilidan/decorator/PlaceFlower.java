package com.ilidan.decorator;

public class PlaceFlower extends AbstractRoomDecorator{
    public PlaceFlower() {
    }

    @Override
    public void liveComfort() {
        this.placeFlower();
        super.liveComfort();
    }

    private void placeFlower(){
        System.out.println("在住进屋子前，我需要放一些小花~");
    }
}
