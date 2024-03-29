import java.util.Scanner;

public class Workplace extends Location {
    private int money;
    int selection;

    Location location;

    public Workplace(Character character) {
        super(character);
        work();
    }

    Scanner scan = new Scanner(System.in);
    
    public void work() {
        switch (character.getcJob()) {
            case 1 -> {
                money = character.getMoney() + 150;
                character.setMoney(money);
            }
            case 2 -> {
                money = character.getMoney() + 100;
                character.setMoney(money);
            }
            case 3 -> {
                money = character.getMoney() + 120;
                character.setMoney(money);
            }
            default -> System.out.println("Geçersiz değer");
        }
        System.out.println("Çalışmanız bitti!");
        System.out.println("Mevcut bakiyeniz : " + character.getMoney());
        System.out.println();
        selectOvertime();

    }
    
    public void selectOvertime() {
        try {

            System.out.println("---------MESAİ--------\n");
            System.out.println("1- Ek mesai istiyorum");
            System.out.println("2- Ek mesai istemiyorum\n");
            System.out.print("Tercihiniz : ");
            selection = scan.nextInt();
            if (selection != 1 && selection != 2) {
                throw new IllegalArgumentException("Geçerli bir değer girmediniz.");
            }

            switch (selection) {
                case 1 -> overtime();
                case 2 -> getLocation();
            }
        } catch (Exception e) {
            System.out.println("Tekrar tercih yapın");
            selectOvertime();
        }
    }
    
    public void overtime() {
        switch (character.getcJob()) {
            case 1 -> {
                money = character.getMoney() + 100;
                character.setMoney(money);
            }
            case 2 -> {
                money = character.getMoney() + 60;
                character.setMoney(money);
            }
            case 3 -> {
                money = character.getMoney() + 80;
                character.setMoney(money);
            }
        }
        System.out.println("Ek mesai bitti");
        System.out.println("Mevcut bakiyeniz : " + character.getMoney());
        System.out.println();
        getLocation();
    }
    
    public void getLocation() {
        int loc = 0;


        try {
            System.out.println("---------Ana Menü--------\n");
            System.out.println("1-Ev");
            System.out.println("2-Mağaza");
            System.out.print("\nGideceğiniz yeri seçin : ");
            loc = scan.nextInt();
            System.out.println();

            if (loc != 1 && loc != 2) {
                throw new FaultyInput(
                        "Geçerli bir değer girmediniz");
            }

        } catch (FaultyInput e) {
            e.getMessage()
            System.out.println("Tekrar tercih yapınız : ");
            getLocation();
        }
        switch (loc) {
            case 1 -> location = new Home(character);
            case 2 -> location = new Store(character);
        }
    }
}