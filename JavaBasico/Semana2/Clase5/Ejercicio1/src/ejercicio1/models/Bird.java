
package ejercicio1.models;

public class Bird extends Animal {
    private double wingSize;
    private String flyType;
    private String plumageColor;
    private String beakType;

    public Bird() {
    }

    public Bird(double wingSize, String flyType, String plumageColor, String beakType, int id, String name, int age, String skin, String feeding) {
        super(id, name, age, skin, feeding);
        this.wingSize = wingSize;
        this.flyType = flyType;
        this.plumageColor = plumageColor;
        this.beakType = beakType;
    }

    public double getWingSize() {
        return wingSize;
    }

    public String getFlyType() {
        return flyType;
    }

    public String getPlumageColor() {
        return plumageColor;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    public void setFlyType(String flyType) {
        this.flyType = flyType;
    }

    public void setPlumageColor(String plumageColor) {
        this.plumageColor = plumageColor;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    @Override
    public String salute() {
        return "Hello, I'm a bird!";
    }
}
