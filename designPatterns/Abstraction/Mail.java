import java.io.*;

public class Mail {
    public void sendMail() {
        connect();
        disconnect();
        auth();
    }

    private void connect() {
        System.out.println("connect");
    }

    private void auth() {
        System.out.println("auth");
    }

    private void disconnect() {
        System.out.println("disconnect");
    }
}