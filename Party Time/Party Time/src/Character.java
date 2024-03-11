import java.util.Scanner;

public class Character {

    Inventory inv;
    String name;

    public Character() {
        this.inv = new Inventory();
        System.out.println("Hoşgeldin ");
    }

    public Character(String name) {
        this.inv = new Inventory();
        this.name = name;
        System.out.println("Hoşgeldin " + name);
    }


    public Inventory getInv() {
        return inv;
    }

    private String cGender;
    private String cSkinColor;
    private String cHairColour;
    private String cEyesColor;
    private static int cJob;
    private static int money;

    //metot3
    public void desing() {
        cGender();
        cSkinColor();
        cHairColour();
        cEyesColor();
        cJob();
        cIntroduction();
    }

    public int getcJob() {
        return cJob;
    }

    public void setcJob(int cJob) {
        Character.cJob = cJob;
    }


    public String getcGender() {
        return cGender;
    }

    public void setcGender(String cGender) {
        this.cGender = cGender;
    }

    public String getcSkinColor() {
        return cSkinColor;
    }

    public void setcSkinColor(String cSkinColor) {
        this.cSkinColor = cSkinColor;
    }

    public String getcHairColour() {
        return cHairColour;
    }

    public void setcHairColour(String cHairColour) {
        this.cHairColour = cHairColour;
    }

    public String getcEyesColor() {
        return cEyesColor;
    }

    public void setcEyesColor(String cEyesColor) {
        this.cEyesColor = cEyesColor;
    }


    public void setMoney(int money) {
        Character.money = money;
    }

    public int getMoney() {
        return money;
    }


    Scanner scan = new Scanner(System.in);

    private void cGender() {
        System.out.println("\nKarakterinizin cinsiyetini seçiniz:<K>adın & <E>rkek");
        String cGender2 = scan.next();
        if (cGender2.equals("K") || cGender2.equals("k")) {
            setcGender("Kadın");
            System.out.println("Cinsiyetiniz: " + getcGender());
        } else if (cGender2.equals("E") || cGender2.equals("e")) {
            setcGender("Erkek");
            System.out.println("Cinsiyetiniz: " + getcGender());
        } else {
            System.out.println("Hatalı karakter girdiniz.Lütfen geçerli bir karakter giriniz");
            cGender();
        }
    }

    private void cSkinColor() {
        System.out.println("\n-----TEN RENGİ-----");
        System.out.println("1-Beyaz");
        System.out.println("2-Buğday");
        System.out.println("3-Bronz");
        System.out.println("4-Esmer\n");
        System.out.print("Tercihiniz : ");
        int cSkinColor;
        cSkinColor = scan.nextInt();

        switch (cSkinColor) {
            case 1 -> {
                setcSkinColor("Beyaz");
                System.out.println("Ten renginiz:" + getcSkinColor());
            }
            case 2 -> {
                setcSkinColor("Buğday");
                System.out.println("Ten renginiz:" + getcSkinColor());
            }
            case 3 -> {
                setcSkinColor("Bronz");
                System.out.println("Ten renginiz:" + getcSkinColor());
            }
            case 4 -> {
                setcSkinColor("Esmer");
                System.out.println("Ten renginiz:" + getcSkinColor());
            }
            default -> {
                System.out.println("Hatalı karakter girdiniz.Lütfen tekrar giriş yapınız.");
                cSkinColor();
            }
        }

    }

    //metot6
    private void cHairColour() {
        System.out.println("\n-----SAÇ RENGİ-----");
        System.out.println("1-Kızıl");
        System.out.println("2-Sarı");
        System.out.println("3-Kahverengi");
        System.out.println("4-Siyah");
        System.out.println("5-Mavi");
        System.out.println("6-Mor\n");
        System.out.print("Tercihiniz : ");
        int cHairColour;
        cHairColour = scan.nextInt();

        switch (cHairColour) {
            case 1 -> {
                setcHairColour("Kızıl");
                System.out.println("Saç renginiz: " + getcHairColour());
            }
            case 2 -> {
                setcHairColour("Sarı");
                System.out.println("Saç renginiz: " + getcHairColour());
            }
            case 3 -> {
                setcHairColour("Kahverengi");
                System.out.println("Saç renginiz: " + getcHairColour());
            }
            case 4 -> {
                setcHairColour("Siyah");
                System.out.println("Saç renginiz: " + getcHairColour());
            }
            case 5 -> {
                setcHairColour("Mavi");
                System.out.println("Saç renginiz: " + getcHairColour());
            }
            case 6 -> {
                setcHairColour("Mor");
                System.out.println("Saç renginiz: " + getcHairColour());
            }

            default -> {
                System.out.println("Hatalı karakter girdiniz.Lütfen tekrar giriş yapınız.");
                cHairColour();
            }
        }
    }

    private void cEyesColor() {
        {
            System.out.println("\n----GÖZ RENGİ----");
            System.out.println("1-Ela");
            System.out.println("2-Sarı");
            System.out.println("3-Kahverengi");
            System.out.println("4-Yeşil");
            System.out.println("5-Mavi");
            System.out.println("6-Mor\n");
            System.out.print("Tercihiniz : ");
            int cEyesColor;
            cEyesColor = scan.nextInt();

            switch (cEyesColor) {
                case 1 -> {
                    setcEyesColor("Ela");
                    System.out.println("Göz renginiz: " + getcEyesColor());
                }
                case 2 -> {
                    setcEyesColor("Sarı");
                    System.out.println("Göz renginiz: " + getcEyesColor());
                }
                case 3 -> {
                    setcEyesColor("Kahverengi");
                    System.out.println("Göz renginiz: " + getcEyesColor());
                }
                case 4 -> {
                    setcEyesColor("Yeşil");
                    System.out.println("Göz renginiz: " + getcEyesColor());
                }
                case 5 -> {
                    setcEyesColor("Mavi");
                    System.out.println("Göz renginiz: " + getcEyesColor());
                }
                case 6 -> {
                    setcEyesColor("Mor");
                    System.out.println("Göz renginiz: " + getcEyesColor());
                }

                default -> {
                    System.out.println("Hatalı karakter girdiniz.Lütfen tekrar giriş yapınız.");
                    cEyesColor();
                }
            }
        }
    }

    public void cJob() {
        System.out.println("\n-----MESLEK-----");
        System.out.println("1-Doktor");
        System.out.println("2-Avukat");
        System.out.println("3-Mühendis");
        int job;
        job = scan.nextInt();
        switch (job) {
            case 1 -> {
                setcJob(1);
                System.out.println("Mesleğiniz: Doktor");
                System.out.println(getcJob());
            }
            case 2 -> {
                setcJob(2);
                System.out.println("Mesleğiniz: Avukat");
            }
            case 3 -> {
                setcJob(3);
                System.out.println("Mesleğiniz: Mühendis");
            }
            default -> {
                System.out.println("Hatalı karakter girdiniz.Lütfen tekrar giriş yapınız.");
                cJob();
            }
        }
    }

    private void cIntroduction() {

        System.out.println("Seçtiğiniz karakter");
        System.out.println("---------------------");
        System.out.println("Karakterinizin cinsiyeti:" + getcGender());
        System.out.println("Karakterinizin ten rengi:" + getcSkinColor());
        System.out.println("Karakterinizin saç rengi:" + getcHairColour());
        System.out.println("Karakterinizin göz rengi:" + getcEyesColor());

    }
}




