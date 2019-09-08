package com.ilidan.chain;

/**
 * GroupLeader
 */
public class GroupLeader extends AbstractTaskHandler{

    public GroupLeader(){
        super(Task.TaskLevel.EASY);
    }

    @Override
    public String handle(Task task) {
        System.out.println(task.getTaskInfo());
        return "小组长处理任务结束！";
    }

}
