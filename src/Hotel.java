public class Hotel extends Building {
    public Hotel(String name, String type,int maxGuest,int price,String address, Person[] people) {
        super(name, type, maxGuest, price, address, people);
    }
    @Override
    public void printMaxGuest() {
        System.out.println(this.getPeople().length+" people live in "+getName());
    }
}
