package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo: Spring IoC ile iyileþtirilecek
		ProductService productService=new ProductManager(new AbcProductDao(), 
				new JLoggerManagerAdapter());
		Product product=new Product(1,2,12,"Elma",50);
		productService.add(product);

	}

}
