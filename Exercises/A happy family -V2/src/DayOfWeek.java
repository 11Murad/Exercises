public enum DayOfWeek {
    Monday(new String[]{"Yemek yemek", "Gezmek"}),
    Sunday(new String[]{"Yemek yemek", "Oynamaq"});

    DayOfWeek(String[] activities) {
        this.activities = activities;
    }

    public final String[] activities;

}
