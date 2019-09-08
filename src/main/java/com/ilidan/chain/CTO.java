package com.ilidan.chain;

/**
 * CTO
 */
public class CTO extends AbstractTaskHandler {

    public CTO() {
        super(Task.TaskLevel.NORMAL);
    }

    @Override
    public String handle(Task task) {
        System.out.println(task.getTaskInfo());
        return "CTO处理任务结束！";
    }
}
