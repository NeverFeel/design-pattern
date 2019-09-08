package com.ilidan.decorator;

public class ComfortableRoom implements Room {
    @Override
    public void liveComfort() {
        System.out.println("住进了一件舒服的屋子~");
    }
}
