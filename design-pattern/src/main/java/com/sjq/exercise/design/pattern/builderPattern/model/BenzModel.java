package com.sjq.exercise.design.pattern.builderPattern.model;

/**
 * 奔驰
 */
public class BenzModel extends CarModel {

    @Override
    public void start() {
        System.out.println("benz start ----");
    }

    @Override
    public void stop() {
        System.out.println("benz stop ----");
    }

    @Override
    public void alarm() {
        System.out.println("benz alarm ----");
    }

}
