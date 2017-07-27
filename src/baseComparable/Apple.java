package baseComparable;

public class Apple implements Comparable<Apple>{
	String name=null;
	float price;
	float weight;
	public Apple(String name, float price, float weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	@Override
	public int compareTo(Apple other) {
		if(this.weight>other.weight) return 1;
		else if(this.weight<other.weight) return -1;
		return 0;
	}
	@Override
	public String toString() {
		return "Apple [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	
}
