public class Person implements LiveAble{
    private String name;
    private int age;
    private String position;
    private String address;

    public Person(String name, int age, String position, String address) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void pay(int familyBudget, Building[] buildings) {
        int counter = 0;
        int sum = familyBudget;
            for (Building building:buildings) {
                while (true) {
                    if (sum > building.getPrice()) {
                        sum = sum - building.getPrice();
                        counter++;
                    } else {
                        break;
                    }
                }
            }
        System.out.println("With a budget of "+familyBudget+"$ Family can live "+ counter +" months");
    }

    @Override
    public void printAddress(Building[] buildings) {
        for (Building building : buildings) {
            for (Person person: building.getPeople()){
                if(person.name.equals(getName())) {
                    if (person.position.equals("Dad")) {
                        System.out.println("The " + person.getName() + " family at " + building.getAddress() + " address");
                    }
                    person.address = building.getAddress();
                }
            }
        }
    }

    @Override
    public String toString() {
            return "\nName = " + name +
                    ", Age = " + age +
                    ", Position = " + position;
    }

}
