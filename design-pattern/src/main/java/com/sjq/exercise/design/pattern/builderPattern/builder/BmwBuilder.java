package com.sjq.exercise.design.pattern.builderPattern.builder;

import com.sjq.exercise.design.pattern.builderPattern.model.BmwModel;
import com.sjq.exercise.design.pattern.builderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * 宝马建造器
 */
public class BmwBuilder extends CarBuilder {

    private final CarModel bmwModel = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }

}
