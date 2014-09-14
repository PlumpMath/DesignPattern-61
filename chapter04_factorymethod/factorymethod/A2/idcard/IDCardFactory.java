package factorymethod.A2.idcard;

import java.util.HashMap;
import java.util.Map;

import factorymethod.A2.framework.Factory;
import factorymethod.A2.framework.Product;


public class IDCardFactory extends Factory {

	private int id = 100;

	private Map owners = new HashMap<Integer, IDCard>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(id++, owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.put(((IDCard)product).getId(), product);
	}
//
//	public List getOwners(){
//		return owners;
//	}

}
