public class Dormitory extends Building {
    public Dormitory(String name, String type,int maxGuest,int price,String address,Person[] people) {
        super(name, type, maxGuest, price, address, people);
    }

    @Override
    public void printMaxGuest() {
        System.out.println(this.getPeople().length+" people live in "+getName());
    }
}
