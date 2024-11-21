public enum Species {
    CAT(false,4),
    DOG(false,4),
    FISH(false,0),;

    Species(Boolean canFly,int numberOfLegs) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
    }

    public final boolean canFly;
    public final int numberOfLegs;
}
