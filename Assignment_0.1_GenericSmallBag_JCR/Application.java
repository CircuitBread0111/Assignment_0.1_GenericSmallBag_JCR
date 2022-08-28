
public class Application{
	public static void main(String[] args) {
		Item<String> str = new Item<String>();
		str.setE("Jerrin Redmon");
		Item<Integer> num = new Item<Integer>();
		num.setE(21);
		
		SmallBag<Item> bag = new SmallBag<Item>();
		bag.setItem(str);
		System.out.println(bag.getItem().getE());
		bag.setItem(num);
		System.out.println(bag.getItem().getE());
	}
		
		
}
