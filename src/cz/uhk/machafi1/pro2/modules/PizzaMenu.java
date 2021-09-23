package cz.uhk.machafi1.pro2.modules;

import java.time.LocalDateTime;
import java.util.*;

public class PizzaMenu {
    private List<PizzaMenuItem> items;
    private LocalDateTime lastUpdate;

    public PizzaMenu() {
        items = new ArrayList<PizzaMenuItem>();
    }

    public void addItem(PizzaMenuItem item){
        items.add(item);
        lastUpdate = LocalDateTime.now();
    }

    public int count(){
        return items.size();
    }

    public List<PizzaMenuItem> getItems() {
        return items;
    }

    public void setItems(List<PizzaMenuItem> items) {
        this.items = items;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
