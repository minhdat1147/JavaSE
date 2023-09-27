public class House {
    private String address;
    private String color;

    public House() {
    }

    public House(String address, String color) {
        super();
        this.address = address;
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void openDoor(){}
    public void closeDoor(){}
}
