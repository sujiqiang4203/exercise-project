package com.sjq.exercise.design.pattern.builderPattern.model;

/**
 * 宝马
 */
public class BmwModel extends CarModel {

    @Override
    public void start() {
        System.out.println("bmw start ----");
    }

    @Override
    public void stop() {
        System.out.println("bmw stop ----");
    }

    @Override
    public void alarm() {
        System.out.println("bmw alarm ----");
    }

}
