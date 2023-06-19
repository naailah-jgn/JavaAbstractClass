public abstract class Vehicle {
    private String brand;
    private int kilometers;

    public Vehicle (String brand){
        this.brand = brand;
        this.kilometers = kilometers;


    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getKilometers(){
        return this.kilometers = kilometers;
    }

    public void setKilometers(int kilometers){
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}