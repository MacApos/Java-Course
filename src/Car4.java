public class Car4 {

    private String name;
    private String model;
    private int year;

    Car4(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
        
    }

    Car4(Car4 x){
        this.copy(x);
    }
    
    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model){
        this.model = model;
    }
    
    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car4 x){
        // this.setName(name); = refers to object which uses this method
        // x.getName(name); = refers to object which has this method
        this.setName(x.getName());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }

}
