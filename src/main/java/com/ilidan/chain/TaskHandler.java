package com.ilidan.chain;

/**
 * 责任链模式
 */
public interface TaskHandler {

    String handle(Task task);

}
