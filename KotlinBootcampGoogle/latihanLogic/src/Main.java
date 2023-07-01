public class Main {
    public static void main(String[] args) {
        String data = "20 agustus 2022";

        String getTahun = data.substring(data.length()-4);
        System.out.println(getTahun);
    }
}