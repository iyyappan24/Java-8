package problemstatement;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class product{
	private int id;
	private String name;
	private float price;
	
	public product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}

class execution{
	
	public double sumOfPrices(List<product> productsList){
		
		float sum =(float)productsList.stream().mapToDouble(e->e.getPrice()).sum();
	    
		return sum;
	}
	public float maxPrice(List<product> productsList){
		
		//float max =productsList.stream().max(Comparator.comparingDouble(product :: getPrice)).map(e->e.getPrice()).get();
	    float max = productsList.stream().map(ui->ui.getPrice()).max((e1,e2)->Float.compare(e1, e2)).get();
		return max;
	}
	
	public float minPrice(List<product> productsList){
		
		float min = productsList.stream().min(Comparator.comparingDouble(product :: getPrice)).map(e->e.getPrice()).get();
	    return min;
	}
	public List<String> getProductsNameList(List<product> productsList){
		
	  List<String> p=productsList.stream().map(e->e.getName()).collect(Collectors.toList());
	  return p;
	}
}
public class streams {

	public static void main(String[] args){
		
		product pro1= new product(1,"milk",67f);
		product pro2 = new product(2,"biscuits",30.5f);
		product pro3 = new product(3,"sweets",8990.09f);
		
		List<product> pr = new ArrayList<>();
		pr.add(pro1);
		pr.add(pro2);
		pr.add(pro3);
		execution ex = new execution();
		double sum = ex.sumOfPrices(pr);
		float max = ex.maxPrice(pr);
		float min = ex.minPrice(pr);
		List<String> li = ex.getProductsNameList(pr);
		System.out.println("Sum of prices "+sum);
		System.out.println("max price :"+max);
		System.out.println("min price"+min);
		System.out.println("Names list");
		li.forEach(e->System.out.println(e));



                System.out.println("welcome to jungle");
	}
	
}