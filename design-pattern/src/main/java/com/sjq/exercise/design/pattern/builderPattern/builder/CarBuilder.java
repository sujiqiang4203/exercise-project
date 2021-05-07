package com.sjq.exercise.design.pattern.builderPattern.builder;

import com.sjq.exercise.design.pattern.builderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * 建造器
 */
public abstract class CarBuilder {

    /**
     * 组装顺序
     * @param sequence
     */
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
