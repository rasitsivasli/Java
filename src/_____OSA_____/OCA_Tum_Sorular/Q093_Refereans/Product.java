package _____OSA_____.OCA_Tum_Sorular.Q093_Refereans;

class Product {
    int id;
    String name;
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
//And given the code fragment:
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;
        boolean ans1 = p1 == p2;
        boolean ans2 = p1.name.contentEquals(p2.name);
        System.out.println(ans1 + ":" + ans2);

    }
}
	/*
	 * What is the result?
		A. true:true
		B. true:false
		C. false:true
		D. false:false

		Answer: C
	 */