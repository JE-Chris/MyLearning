package InterFace_USB;

public class Demo {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.PowerOn();

        USB m = new Mouse();
        l.UseDevice(m);

        USB k = new KeyBoard();
        l.UseDevice(k);

        l.PowerOff();
    }
}
