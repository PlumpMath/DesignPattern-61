package factorymethod.sample.idcard;

import java.util.ArrayList;
import java.util.List;

import factorymethod.sample.framework.Factory;
import factorymethod.sample.framework.Product;

public class IDCardFactory extends Factory {

	private List owners = new ArrayList<IDCard>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List getOwners(){
		return owners;
	}

}
