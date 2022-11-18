import java.util.Arrays;

public abstract class Building implements HabitAble {
    private String name;
    private String type;
    private int maxGuest;
    private int price;
    private String address;
    private Person[] people;

    public Building(String name, String type, int maxGuest, int price, String address, Person[] people) {
        this.name = name;
        this.type = type;
        this.maxGuest = maxGuest;
        this.price = price;
        this.address = address;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Type = " + type + ", Max. Guest = " + maxGuest +
                ", Price = " + price +", Address = " + address + "\n     ----------People----------" + Arrays.toString(people);
    }
}
