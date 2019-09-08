package com.ilidan.chain;

import java.util.Objects;

/**
 * 抽象的责任链处理器
 */
public abstract class AbstractTaskHandler implements TaskHandler {

    private Task.TaskLevel taskLevel;

    private AbstractTaskHandler nextTaskHandler;

    public AbstractTaskHandler(Task.TaskLevel taskLevel){
        this.taskLevel = taskLevel;
    }

    /**
     * 模板方法，用于找到合适的处理人
     * @param task 任务
     * @return 处理结果
     */
    public final String choiceTaskHandler(Task task) {
        if (Objects.equals(this.getTaskLevel(), task.getTaskLevel())) {
            return this.handle(task);
        } else {
            if (nextTaskHandler != null) {
                return nextTaskHandler.choiceTaskHandler(task);
            } else {
                return "没有找到合适的处理人！";
            }
        }
    }

    public Task.TaskLevel getTaskLevel() {
        return taskLevel;
    }

    public AbstractTaskHandler getNextTaskHandler() {
        return nextTaskHandler;
    }

    public void setNextTaskHandler(AbstractTaskHandler nextTaskHandler) {
        this.nextTaskHandler = nextTaskHandler;
    }
}
