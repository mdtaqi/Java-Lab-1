package hit.day37;

public class EnumDemo {
		public static void main(String[] args) {
			System.out.println("Interface..:"+MyConstants.pi);
			System.out.println("Enum...:"+MyConstantsEnum2.pi.getValue());
			
			met(MyConstants.tan30);//interface	
			met(MyConstantsEnum2.tan30.getValue());//enum
			
			switch((int)MyConstants.tan30) {//interface
			case 1:
			{
				System.out.println("it is tan 30");
			}
			}
			
			switch((int)MyConstantsEnum2.tan30.getValue()) {//enum
			case 1:
			{
				System.out.println("it is tan 30");
			}
			}
			
			//another enum
			MyConstantsEnum v=MyConstantsEnum.orange;
			enumMet(v);
			
			for(MyConstantsEnum me:MyConstantsEnum.values()) {
				System.out.println(me+" and its price is...:"+me.getPrice());
			}
			
		}
		public static void enumMet(MyConstantsEnum mce) {
			switch(mce) {
			case apple:{
				System.out.println("The enum is apple.....");
				System.out.println("The price of apple is...:"+mce.getPrice());
				break;
			}
			case orange:{
				System.out.println("The enum is orange.....");
				System.out.println("The price of orange is...:"+mce.getPrice());
				break;
			}
			case mango:{
				System.out.println("The enum is mango.....");
				System.out.println("The price of mango is...:"+mce.getPrice());
				break;
			}
			}
		}
		public static void met(float tanvalue) {
			System.out.println(tanvalue);
		}
		
	}
	interface MyConstants{
		public final static float pi=3.14f;
		public final static String e="mcsquare";
		public final static float tan30=1.2f;	
	}
	enum MyConstantsEnum{
		apple(20),mango(30),orange(40);
		int price;
		private MyConstantsEnum(int price) {
			this.price=price;
		}
		public int getPrice() {
			return this.price;
		}
	}
	enum MyConstantsEnum2{
		pi(3.14f),tan30(1.2f);
		float value;
		private MyConstantsEnum2(float value) {
			this.value=value;
		}
		
		public float getValue() {
			return this.value;
		}
	
}
