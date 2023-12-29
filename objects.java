import java.util.Scanner;

public class objects {

    Scanner inputScanner = new Scanner(System.in);

    private String name;
    private Integer age;
    private String race;

    public objects(Scanner inpuScanner) {
        System.out.println("Digite seu nome: ");
        this.name = inputScanner.next();
        System.out.println("Digite sua idade: ");
        this.age = inputScanner.nextInt();
        System.out.println("Digite sua classe: ");
        this.race = inputScanner.next();
    }

    public void attack() {
        if (race.equals("mago")) {
            System.out.println("O mago atacou usando magia");
        } else if (race.equals("guerreiro")) {
            System.out.println("O guerreiro atacou usando espada");
        } else if (race.equals("monje")) {
            System.out.println("O monje atacou usando artes marciais");
        } else {
            System.out.println("O ninja atacou usando uma shuriken");
        }
    }
}
