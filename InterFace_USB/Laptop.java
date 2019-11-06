package InterFace_USB;

public class Laptop {

    public void PowerOn() {
        System.out.println("The Laptop is Power On!");
    }

    public void PowerOff() {
        System.out.println("The Laptop is Power Off!");
    }

    public void UseDevice(USB u) {
        u.OpenEquipment();

        if (u instanceof Mouse) {
            ((Mouse) u).Click();
        } else if (u instanceof KeyBoard) {
            ((KeyBoard) u).Knock();
        }

        u.CloseEquipment();
    }

}
