package com.sjq.exercise.design.pattern.builderPattern.model;

import java.util.ArrayList;

public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<>();

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    /**
     * 通过参数sequence中的变量顺序决定方法的执行顺序
     */
    public void run() {

        for (String s : sequence) {
            if (s.equalsIgnoreCase("start")) {
                this.start();
            } else if (s.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (s.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else {
                System.out.println("no action");
            }
        }
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
