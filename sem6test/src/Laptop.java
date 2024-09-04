public class Laptop {
    private String model;
    private Double price;
    private String color;
    private String OS;
    private String processor;
    private String RAM;
    private String memory;
    private String graphicProcessor;

    public Laptop(String model, Double price, String color, String OS, String processor, String RAM, String memory, String graphicProcessor) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.OS = OS;
        this.processor = processor;
        this.RAM = RAM;
        this.memory = memory;
        this.graphicProcessor = graphicProcessor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "model " + model +
                "\nprice " + price + "$" +
                "\ncolor " + color +
                "\nOS " + OS +
                "\nprocessor " + processor +
                "\nRAM " + RAM + "GB" +
                "\nmemory " + memory + "TB" +
                "\ngraphicProcessor " + graphicProcessor +
                "\n";
    }
}
