package creational;

public class Sample {
    public void setData(String data) {
        this.data = data;
    }

    public static void setTime(String time) {
        this.time = time;
    }

    private static String data;
    private static String time;



    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.setData();
    }

}
