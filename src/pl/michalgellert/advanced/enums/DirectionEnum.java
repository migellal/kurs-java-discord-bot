package pl.michalgellert.advanced.enums;

import java.util.Optional;

public enum DirectionEnum {
    LEFT(1, 89), RIGHT(91, 179);

    private final int minAngle;
    private final int maxAngle;

    DirectionEnum(int minAngle, int maxAngle) {
        this.minAngle = minAngle;
        this.maxAngle = maxAngle;
    }

    public static Optional<DirectionEnum> findDirection(int angle) {
        if (angle >= DirectionEnum.LEFT.minAngle && angle <= DirectionEnum.LEFT.maxAngle) {
            return Optional.of(DirectionEnum.LEFT);
        } else if (angle >= DirectionEnum.RIGHT.minAngle && angle <= DirectionEnum.RIGHT.maxAngle) {
            return Optional.of(DirectionEnum.RIGHT);
        } else {
            return Optional.empty();
        }
    }

    public int getMinAngle() {
        return minAngle;
    }

    public int getMaxAngle() {
        return maxAngle;
    }
}
