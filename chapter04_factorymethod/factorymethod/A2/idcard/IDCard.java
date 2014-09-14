package factorymethod.A2.idcard;

import factorymethod.A2.framework.Product;

public class IDCard extends Product {



	private int id;
	private String owner;

	IDCard(int id, String owner){
		System.out.println(owner + "のカードをID:" + id + "で作ります。");
		this.id = id;
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("ID:" + id + ", " + owner + "のカードを使います。");

	}

	public String getOwner(){
		return owner;
	}

	public int getId(){
		return id;
	}
}
