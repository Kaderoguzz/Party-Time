public abstract class Location {
    protected Character character;

    public Location(Character character) {

        this.character = character;
    }

    public abstract void getLocation();


}