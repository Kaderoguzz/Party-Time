import java.util.Scanner;

public class Home extends Location {


    public Home(Character character) {
        super(character);
        System.out.println("\nŞu anda evdesiniz\n");
        getLocation();
    }
    public Home(Character character,String name) {
        super(character);
        System.out.println("\n" + name + " şu anda evdesin\n");
        getLocation();

    }

    Scanner scan = new Scanner(System.in);
    Location location;

    public void party() {
        int necessary = 0;
        if (character.inv.getDrink() != null) {
            System.out.println(character.inv.getDrink() + " var");
            necessary += 1;
        } else {
            System.out.println("İçecek yok");
        }
        if (character.inv.getFood() != null) {
            System.out.println(character.inv.getFood() + " var");
            necessary += 1;
        } else {
            System.out.println("Yiyecek yok");
        }
        if (character.inv.getDecoration() != null) {
            System.out.println(character.inv.getDecoration() + " var");
            necessary += 1;
        } else {
            System.out.println("Dekorasyon yok");
        }
        if (character.inv.getDesert() != null) {
            System.out.println(character.inv.getDesert() + " var");
            necessary += 1;
        } else {
            System.out.println("Dekorasyon yok");
        }
        if (necessary == 4) {
            System.out.println("Parti Başlasın.");
            System.out.println();
            System.out.println("TEBRİKLER OYUN BİTTİ!!!");
            System.exit(264562);


        } else {
            System.out.println("Parti için gerekli malzeme yok.");

            getLocation();
        }

    }

    public void getLocation() {
        int loc = 0;
        try {
            System.out.println("---------Ana Menü--------\n");
            System.out.println("1-Mağazaya gitmek");
            System.out.println("2-İşyerine gitmek");
            System.out.println("3-Parti düzenlemek");
            System.out.print("\nYapmak istediğiniz şıkkı seçin: ");
            loc = scan.nextInt();
            System.out.println();

            if (loc != 1 && loc != 2 && loc != 3) {
                throw new IllegalArgumentException("Geçerli bir değer girmediniz");
            }

        } catch (Exception e) {
            System.out.println("Tekrar tercih yapınız : ");
            getLocation();
        }
        switch (loc) {
            case 1 -> location = new Store(character);
            case 2 -> location = new Workplace(character);
            case 3 -> party();
        }
    }

}


