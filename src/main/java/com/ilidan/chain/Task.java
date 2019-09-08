package com.ilidan.chain;

/**
 * 任务
 */
public class Task {

    private String taskInfo;
    private TaskLevel taskLevel;

    public Task(TaskLevel taskLevel) {
        this.taskLevel = taskLevel;
        switch (taskLevel) {
            case EASY:
                taskInfo = "处理了一个简单的任务！";
                break;
            case NORMAL:
                taskInfo = "处理了一个正常的任务！";
                break;
            case DIFFICULT:
                taskInfo = "处理了一个困难的任务！";
                break;
            default:
                taskInfo = "一个空的任务，不需要处理！";
        }
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public TaskLevel getTaskLevel() {
        return taskLevel;
    }

    public enum TaskLevel {
        EASY,
        NORMAL,
        DIFFICULT;
    }
}
