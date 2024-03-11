public class Inventory {
    private String drink;
    private String food;
    private String desert;
    private String decoration;


    Inventory() {
        this.setDrink(null);
        this.setFood(null);
        this.setDesert(null);
        this.setDecoration(null);
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }
}
