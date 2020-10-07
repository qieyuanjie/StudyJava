package property;

public abstract class Item {
    String name;
    int price;

    //    public String toString() {
//    	return name + price;
//    }
//    public void finalize() {
//    	System.out.println("当前对象正在被回收");
//    }
//    public boolean equals(Object o) {
//    	if(o instanceof Item) {
//    		Item I = (Item)o;
//    		return this.price == I.price;
//    	}
//    	return false;
//    }
    public abstract boolean disposable();

    public static void main(String[] args) {
//    	Item I1 = new Item();
//    	I1.name = "血瓶";
//    	I1.price = 300;
//    	Item I2 = new Item();
//    	I2.name = "蓝瓶";
//    	I2.price = 400;
//    	System.out.println(I1);
//
//    	Item I4;
//    	for (int i = 0; i < 1000000; i++) {
//			I4 = new Item();
//		}
//    	
//    	Item I5 = new Item();
//    	I5.price = 300;
//    	System.out.println(I1.equals(I2));
//    	System.out.println(I1.equals(I5));
    }
}