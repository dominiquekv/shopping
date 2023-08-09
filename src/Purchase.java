public class Purchase {
    private String description;
    private double value;




    public Purchase(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Purchase: description = '" + description +"', '" + value + "'.";
    }
}
