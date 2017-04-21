package org.joyofcoding.objectcalisthenics;

/**
 * Created by Daniel on 27-3-2017.
 */
public class Ticket implements Item{
    protected String name;
    protected int sellIn;
    protected int quality;

    public Ticket(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }


    @Override
    public void increaseSellIn(int value){
        sellIn += value;
    };

    @Override
    public void decreaseSellin(int value){
        sellIn -= value;
    }

    @Override
    public void increaseQuality(int value){
        quality += value;
    }

    @Override
    public void decreaseQuality(int value) {
        quality = quality -value;
    }

    public int getQuality() {
        return quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    @Override
    public void setQualitytoZero() {

    }

    ;

    @Override
    public void updateQuality(){

        if (quality < 50) {
            increaseQuality(1);

            if (sellIn < 11) {
                if (quality < 50) {
                    increaseQuality(1);
                }
            }
            if(sellIn <6){
                if(quality <50){
                    increaseQuality(1);
                }
            }

            decreaseSellin(1);
            if(sellIn < 0){
                decreaseQuality(1);
            }
        }
    }
}
