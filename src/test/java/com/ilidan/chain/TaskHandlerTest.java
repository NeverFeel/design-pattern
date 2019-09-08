package com.ilidan.chain;

/**
 * 责任链模式测试
 */
public class TaskHandlerTest {

    public static void main(String[] args) {

        Task task = new Task(Task.TaskLevel.EASY);
        TaskHandlerContext taskHandlerContext = new TaskHandlerContext();
        System.out.println(taskHandlerContext.handleTask(task));
        System.out.println("========================");
        Task task2 = new Task(Task.TaskLevel.DIFFICULT);
        System.out.println(taskHandlerContext.handleTask(task2));

    }

}