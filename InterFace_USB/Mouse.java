package InterFace_USB;

public class Mouse implements USB {

    @Override
    public void CloseEquipment() {
        System.out.println("The mouse's USB Interface is closed!");
    }

    @Override
    public void OpenEquipment() {
        System.out.println("The mouse's USB Interface is opened!");
    }

    public void Click() {
        System.out.println("This mouse is Clicking!");
    }
}
