import java.util.Set;

public class Choice {
    private ConsoleInputOutput io = new ConsoleInputOutput();
    private LaptopService service = new LaptopService();

    public void chooseColor(Set<Laptop> resultLaptops) {

        System.out.println("В нашем ассортименте представлены модели несколько цветов.\n" +
                "Введите число соответствующее интересующему Вас цвету.\n" +
                "1 - красный\n" +
                "2 - чёрный\n" +
                "3 - серебристый");

        int param = io.checkInput2();

        switch (param) {
            case 1:
                service.findByColor(resultLaptops, "Красный");
                break;
            case 2:
                service.findByColor(resultLaptops, "Чёрный");
                break;
            case 3:
                service.findByColor(resultLaptops, "Серебристый");
                break;
        }
    }

}
