package com.sjq.exercise.design.pattern.builderPattern;

import com.sjq.exercise.design.pattern.builderPattern.director.CarDirector;

/**
 * 场景类
 */
public class Client {

    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        //生产10辆A类型Benz车
        System.out.println("生产10辆A类型Benz车");
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + (i + 1) + "辆");
            director.getBenzAModel().run();
        }

        System.out.println("生产1辆B类型的Benz车");
        director.getBenzBModel().run();

        System.out.println("生产1辆C类型的Bmw车");
        director.getBmwCModel().run();

    }

}
