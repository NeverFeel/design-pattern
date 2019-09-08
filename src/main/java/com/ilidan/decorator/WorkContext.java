package com.ilidan.decorator;

import java.util.List;

/**
 *
 */
public interface WorkContext {

    Worker getWorker();

    Room getTargetRoom();

    List<AbstractRoomDecorator> getRoomDecorators();

    void decorateRoom();

}
