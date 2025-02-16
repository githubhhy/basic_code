package Demo22;

public class Object {
    private String id;
    private String name;
    private int price;
    private int store;

    public Object(){}
    public Object(String id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStore() {
        return store;
    }
    public void setStore(int store) {
        this.store = store;
    }

    
    
}
