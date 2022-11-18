import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] family1 = new Person[]{
                new Person("Iskhak", 20, "Dad", ""),
                new Person("Iskhak", 20, "Mom", ""),
                new Person("Iskhak", 20, "Son", ""),
                new Person("Iskhak", 20, "Daughter", ""),
        };
        Person[] family2 = new Person[]{
                new Person("Dastan", 20, "Dad", ""),
                new Person("Dastan", 20, "Mom", ""),
                new Person("Dastan", 20, "Son", ""),
                new Person("Dastan", 20, "Daughter", ""),
        };
        Person[] family3 = new Person[]{
                new Person("Mukhammed", 19, "Dad", ""),
                new Person("Mukhammed", 19, "Mom", ""),
                new Person("Mukhammed", 19, "Son", ""),
                new Person("Mukhammed", 19, "Daughter", ""),
        };

        Building flat = new Flat("Ihlas", "Flat", 8, 7500, "Anarbeka Bakaeva", family1);
        Building dormitory = new Dormitory("KUSTAA", "Dormitory", 180, 2000, "Chyngyz Aitmatov", family2);
        Building hotel = new Hotel("City", "Hotel", 120, 3000, "Baumana", family3);
        Building[] buildings = {flat, dormitory, hotel};

        while (true) {
            System.out.println("Choice 1(ShowAll), 2(Max. Guest), 3(Address)");
            int number = input.nextInt();
            switch (number) {
                case 1:
                    for (Building building : buildings) {
                        System.out.println();
                        System.out.println(building);
                        for (Person people : building.getPeople()) {
                            if (building.getName().equals("Ihlas")) {
                                people.pay(50000, buildings);
                                break;
                            } else if (building.getName().equals("KUSTAA")) {
                                people.pay(20000, buildings);
                                break;
                            } else {
                                people.pay(30000, buildings);
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    for (Building building : buildings) {
                        building.printMaxGuest();
                    }
                    break;
                case 3:
                    for (Building building : buildings) {
                        for (Person people : building.getPeople()) {
                            if (building.getName().equals("Ihlas")) {
                                people.printAddress(buildings);
                                break;
                            } else if (building.getName().equals("KUSTAA")) {
                                people.printAddress(buildings);
                                break;
                            } else {
                                people.printAddress(buildings);
                                break;
                            }
                        }
                    }
                    break;
            }
        }
    }
}