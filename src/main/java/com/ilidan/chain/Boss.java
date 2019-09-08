package com.ilidan.chain;

/**
 * boss
 */
public class Boss extends AbstractTaskHandler {

    public Boss(){
        super(Task.TaskLevel.DIFFICULT);
    }

    @Override
    public String handle(Task task) {
        System.out.println(task.getTaskInfo());
        return "boss处理任务结束！";
    }

}
