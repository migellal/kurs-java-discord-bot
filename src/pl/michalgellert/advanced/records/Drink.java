package pl.michalgellert.advanced.records;

import java.util.List;

public record Drink(int size, List<String> ingredients) {
    public Drink(int size) {
        this(size, List.of("Water"));
    }

    public boolean hasWater() {
        return ingredients.contains("Water");
    }
}
