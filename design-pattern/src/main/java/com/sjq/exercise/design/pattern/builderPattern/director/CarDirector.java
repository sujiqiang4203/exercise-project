package com.sjq.exercise.design.pattern.builderPattern.director;

import com.sjq.exercise.design.pattern.builderPattern.builder.BenzBuilder;
import com.sjq.exercise.design.pattern.builderPattern.builder.BmwBuilder;
import com.sjq.exercise.design.pattern.builderPattern.builder.CarBuilder;
import com.sjq.exercise.design.pattern.builderPattern.model.BenzModel;
import com.sjq.exercise.design.pattern.builderPattern.model.BmwModel;

import java.util.ArrayList;

/**
 * 建造指挥者（导演的角色）
 */
public class CarDirector {

    private final ArrayList<String> sequence = new ArrayList<>();
    private final CarBuilder benzBuilder = new BenzBuilder();
    private final CarBuilder bmwBuilder = new BmwBuilder();

    /**
     * 导演 指挥 benz建造器 建造一辆 A类型的 benz汽车
     *
     * @return
     */
    public BenzModel getBenzAModel() {

        sequence.clear();
        sequence.add("alarm");
        sequence.add("start");

        benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * 导演 指挥 benz建造器 建造一辆 B类型的 benz汽车
     *
     * @return
     */
    public BenzModel getBenzBModel() {

        sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");

        benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * 导演 指挥 bmw建造器 建造一辆 C类型的 bmw汽车
     *
     * @return
     */
    public BmwModel getBmwCModel() {

        sequence.clear();
        sequence.add("start");
        sequence.add("stop");

        bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }


}
