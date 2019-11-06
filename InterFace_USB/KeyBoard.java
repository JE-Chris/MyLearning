package InterFace_USB;

public class KeyBoard implements USB {

    @Override
    public void CloseEquipment() {
        System.out.println("The keyboard's USB Interface is closed!");
    }

    @Override
    public void OpenEquipment() {
        System.out.println("The keyboard's USB Interface is opened!");
    }

    public void Knock() {
        System.out.println("This keyboard is knocking!");
    }
}
