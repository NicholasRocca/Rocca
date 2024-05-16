public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone(){};

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand=brand;
        this.model=model;
        this.storageCapacity=storageCapacity;
        this.price=price;
    }

    public Smartphone(Smartphone other) {
        this(other.getBrand(), other.getModel(),other.getStorageCapacity(), other.getPrice());
    }


 
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String s ="";
        s+="Brand: " + brand+","+ " Model: "+ model+"," + " Storage Capacity: " + storageCapacity +"GB,"+" Price: " + price;
        
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        boolean verifica = false;
        if(this==obj){
            verifica=true;
        } else {
            if(obj instanceof Smartphone){
                Smartphone smart = (Smartphone) obj;
                if(smart.getBrand().equals(this.getBrand())&& smart.getStorageCapacity()==this.getStorageCapacity() && smart.getPrice()==this.price&&smart.getModel().equals(this.getModel())){
                    verifica =true;
                }
            }
        }


        return verifica;
    }
    }
    

