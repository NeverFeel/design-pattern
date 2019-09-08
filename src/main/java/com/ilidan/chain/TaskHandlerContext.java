package com.ilidan.chain;

/**
 * 处理器上下文
 */
public class TaskHandlerContext {

    private static final AbstractTaskHandler boss = new Boss();
    private static final AbstractTaskHandler cto = new CTO();
    private static final AbstractTaskHandler gl = new GroupLeader();
    private Task task;

    public TaskHandlerContext() {
        boss.setNextTaskHandler(cto);
        cto.setNextTaskHandler(gl);
    }

    /**
     * 处理任务
     * @return 处理结果
     */
    public String handleTask(Task task) {
        this.task = task;
        return boss.choiceTaskHandler(task);
    }

    public Task getTask() {
        return task;
    }

    public TaskHandler getTopTaskHandler() {
        return boss;
    }
}
