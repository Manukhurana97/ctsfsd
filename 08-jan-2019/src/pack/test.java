package pack;

public class test {

	public static void main(String[] args) {
		
		productinterface[] p = new productinterface[4];
		
		p[0]  = new Book("2019", "abc", 100);
		p[1]  = new mp3("2018", 1000, "abcde");
		p[2]  = new tv("2019", 100, "abcdefg");
		p[3]  = new Book("2018", "abcdefgh", 1000);
		

		
		double totalRegularPrice = 0;
        double totalSalePrice = 0;
        
		
        
        double totalRegularPrice1 = 0;
        double totalSalePrice1 = 0;
        
        for (int i=0; i<p.length; i++){
            
            // Call a method of the super class to get
            // the regular price.
            totalRegularPrice1 += p[i].getregularprice();
            
            // Since the sale price is computed differently
            // depending on the product type, overriding (implementation)
            // method of the object instance of the sub-class
            // gets invoked.  This is runtime polymorphic
            // behavior.
            totalSalePrice1 += p[i].computeprice();
            
            System.out.println("Item number " + i +
                    ": Type = " + p[i].getClass().getName() +
                    ", Regular price = " + p[i].getregularprice() +
                    ", Sale price = " + p[i].computeprice());
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice1);
        System.out.println("totalSalePrice = " + totalSalePrice1);
    }
	

}
