package com.sjq.exercise.design.pattern.builderPattern.builder;

import com.sjq.exercise.design.pattern.builderPattern.model.BenzModel;
import com.sjq.exercise.design.pattern.builderPattern.model.CarModel;

import java.util.ArrayList;

/**
 * 奔驰建造器
 */
public class BenzBuilder extends CarBuilder {

    private final CarModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }


}
