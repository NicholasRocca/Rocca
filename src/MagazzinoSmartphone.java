public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        Smartphone smartphone= null;
        this.smartphones=new Smartphone[10];
        for (int i = 0; i < other.smartphones.length; i++) {
            if(other.smartphones[i]!=null){
                smartphone=new Smartphone(other.smartphones[i]);
                this.addSmartphone(smartphone);
            }
        }



        
    }


    public void addSmartphone(Smartphone smartphone) {
        if(smartphone!=null){
            if(count<10){
                this.smartphones[count]=new Smartphone(smartphone);
                
                count++;
            }
        }
        
    }

    public void removeSmartphone(Smartphone smartphone) {
        if(smartphone!=null){
           if(count!=0){
             boolean find=false;
              int i =0;
               while (!find&&i<count) {
                if(this.smartphones[i]!=null){
                        if (smartphones[i].equals(smartphone)) {
                        smartphones[i]=null;
                       find=true;
                       count--;
                            }else{
                                i++;
                            }
                        
                    } else {
                        i++;
                    }
                
              }
          }
      }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;
        if(brand!=null){
            boolean t=false;
            int i =0;
            while(!t&&i<count ){
                if(this.smartphones[i]!=null){
                    if(this.smartphones[i].getBrand().equals(brand)){
                        smartphone=new Smartphone(this.smartphones[i]);
                        t=true;
                    } else{i++;}
            }else{i++;}
        }
        }

        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        Smartphone smartphone = null;
        if(storageCapacity>0){
            boolean t=false;
            int i =0;
            while(!t&&i<smartphones.length ){
                if(this.smartphones[i]!=null){
                    if(this.smartphones[i].getStorageCapacity()==storageCapacity){
                        smartphone=new Smartphone(this.smartphones[i]);
                        magazzinoSmartphone.addSmartphone(smartphone);
                        t=true;
                    } else{i++;}
            }else{i++;}
        }
        }

    

        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        Smartphone smartphone = null;
        if(minPrice>0&&maxPrice>minPrice){
           for (int j = 0; j < smartphones.length; j++) {
            if(this.smartphones[j]!=null){
                if(this.smartphones[j].getPrice()>minPrice && this.smartphones[j].getPrice()<maxPrice ){
                    smartphone=new Smartphone(this.smartphones[j]);
                    magazzinoSmartphone.addSmartphone(smartphone);
                    
           }
                
        }
        }

        
    }
    return magazzinoSmartphone;
}

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for (int i = 0; i < this.smartphones.length; i++) {
            if(smartphones[i]!=null){
                result+=smartphones[i].toString() +"\n";
                
            }
        }
        return result;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
       

        return true;
    }


}