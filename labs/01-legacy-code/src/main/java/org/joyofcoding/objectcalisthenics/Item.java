package org.joyofcoding.objectcalisthenics;

/**
 * Created by Daniel on 27-3-2017.
 */
public interface Item {


    void increaseSellIn(int value);

    void decreaseSellin(int value);

    void increaseQuality(int value);

    void decreaseQuality(int value);

    void setQualitytoZero();

    void updateQuality();


}
