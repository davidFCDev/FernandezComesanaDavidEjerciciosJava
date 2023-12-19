
package ejercicio1.models;

public class Animal {
    private int id;
    private String name;
    private int age;
    private String skin;
    private String feeding;

    public Animal() {
    }

    public Animal(int id, String name, int age, String skin, String feeding) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skin = skin;
        this.feeding = feeding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSkin() {
        return skin;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", age=" + age + ", skin=" + skin + ", feeding=" + feeding + '}';
    }
    
    public String salute(){
        return "Hello, I'm an animal!";
    }
}
