package xox.lol.data;

public enum Level {
    STANDARD("This is standard"),
    PREMIUM("This is Premium"),
    VIP("This is VIP");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
