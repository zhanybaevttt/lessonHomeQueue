public class Car1  {
    private int year;
    private String model;
    private String color;

    public Car1(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car1 " +
                " year " + year +
                "  model= " + model + '\'' +
                "\n color " + color + '\'' +
                ' ';
    }
}

