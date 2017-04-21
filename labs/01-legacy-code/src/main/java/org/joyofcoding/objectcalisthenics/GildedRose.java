package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        //armor
        items.add(new Armor("+5 Dexterity Vest", 10, 20));
        //food
        items.add(new Food("Aged Brie", 2, 0));

        //potion
        items.add(new Potion("Conjured Mana Cake", 3, 6));
        items.add(new Potion("Elixir of the Mongoose", 5, 7));
        //weapon
        items.add(new Weapon("Sulfuras, Hand of Ragnaros", 0, 80));
        //ticket
        items.add(new Ticket("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        return items;
    }

    public void updateQuality(List<Item> items) {
        for (Item currentItem : items) {
            currentItem.updateQuality();
        }
    }
}
