package fr.ensai.elevator;

public enum Direction {
    UP,
    DOWN,
    IDLE;

    public String getArrowSymbol() {
        switch (this) {
            case UP: return "↑";
            case DOWN: return "↓";
            default: return "";
        }
    }
}
