package com.ilidan.decorator;

import java.util.LinkedList;
import java.util.List;

/**
 * 我懒，我请了工人帮我装饰屋子，
 * 这样我就有更多的时间去做其他事情。
 * <p>
 * 这个工人只能这样装饰我的屋子，如果要装饰
 * 其他风格的屋子，请其他工人
 */
public class WorkerA implements Worker {

    private List<AbstractRoomDecorator> roomDecorators;

    private WorkerA() {
        roomDecorators = new LinkedList<>();
        roomDecorators.add(new CleanRoom());
        roomDecorators.add(new PlaceFlower());
    }

    public static Worker getWorker() {
        return WorkerHolder.WORKER;
    }

    @Override
    public List<AbstractRoomDecorator> getRoomDecorators() {
        return roomDecorators;
    }

    private static class WorkerHolder {
        private static final WorkerA WORKER = new WorkerA();
    }

}
