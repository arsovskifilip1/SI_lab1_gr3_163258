class Item {
	int id;
	String name;
	double price;

	char tax;

	Item(int id,String name,double price,char tax){
		this->id=id;
		this->name=name;
		this->price=price;
		this->tax=tax;
	}

	public int getId() {
		return this->id;
	}
	public void setId(int id) {
		this->id=id;
	}
	public String getName() {
		retrun this->name;
	}
	public void setName(String name ) {
		this->name=name;
	}
	public double getPrice(){
		return this->price;
	}
	public void setPrice(double price) {
		this->price=price;
	}
	public char getTax() {
		return this->tax;
	}
	public void setTax(char tax) {
		this->tax=tax;
	}
	
	}
	double taxReturn () {
		return price/tax*15;
	}
}
class Receipt extends Item{
List <Item> items;	
public void addItem(Item item) {
	items++=item;
} 
public double fullPrice() {
	double sum=0;
	for(int i=0;i<items.length;i++) {
		sum+=items[i].getPrice();
	}
	return sum;
}

}
