import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LaptopService {

    private Laptop laptop1 = new Laptop("msi10", 399.99, "Красный", "Windows", "AMD", "16", "1", "AMD");
    private Laptop laptop2 = new Laptop("Acer1", 299.99, "Серебристый", "Linux", "Intel", "8", "1", "без видеокарты");

    private final Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2));

    public void findByColor(Set<Laptop> resultLaptops, String param) {
        for (Laptop laptop : laptops) {
            if (!laptop.getColor().equals(param)) {
                resultLaptops.remove(laptop);
            }
        }
    }

    public Set<Laptop> getAll() {
        return laptops;
    }
}
