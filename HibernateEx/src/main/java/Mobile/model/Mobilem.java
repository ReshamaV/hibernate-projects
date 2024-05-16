package Mobile.model;

public class Mobilem {
  private int id;
  private String mmodel,price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMmodel() {
	return mmodel;
}
public void setMmodel(String mmodel) {
	this.mmodel = mmodel;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Mobilem(int id, String mmodel, String price) {
	super();
	this.id = id;
	this.mmodel = mmodel;
	this.price = price;
}
public Mobilem() {
	super();
}


}
