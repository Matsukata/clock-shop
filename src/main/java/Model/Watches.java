package Model;

public class Watches {
    private String brand;
    private double price;
    private String countryProducer;
    private String style;
    private String materialCorp;
    private String sex;

    public Watches(String brand, double price, String countryProducer, String style, String materialCorp, String sex) {
        this.brand = brand;
        this.price = price;
        this.countryProducer = countryProducer;
        this.style = style;
        this.materialCorp = materialCorp;
        this.sex = sex;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountryProducer() {
        return countryProducer;
    }

    public void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMaterialCorp() {
        return materialCorp;
    }

    public void setMaterialCorp(String materialCorp) {
        this.materialCorp = materialCorp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Часы " + this.getBrand() + " " + this.getSex() + " производство: " +this.getCountryProducer()
                + " стоимость: " + this.getPrice();
    }
}
