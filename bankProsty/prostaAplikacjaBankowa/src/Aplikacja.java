import java.util.Random;

public class Aplikacja {
    public int balance;
    public String clientName;
    public String klientID;

    public Aplikacja(int balance, String clientName) {
        this.balance = balance;
        this.clientName = clientName;
        this.klientID = RandomID();
    }

    public String RandomID(){
        int leftLimit = 48; // '0'
        int rightLimit = 122; // 'z'
        int targetStringLength = 20;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 63) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }
}
