package hit.day27;

public class GenericsDemo {

		public static void main(String[] args) {
			Paint paint=new RedPaint();
			GoodPaintBrush brush=new GoodPaintBrush();
			
			brush.paint=paint;
			
			brush.doPaint();
			
			BadPaintBrush bpb=new BadPaintBrush();
			bpb.doPaint(1);
		}
	}
	abstract class Paint{
		
	}
	class RedPaint extends Paint{
		
	}
	class BluePaint extends Paint{
		
	}
	class GoodPaintBrush{
		Paint paint;
		public void doPaint() {
			System.out.println(paint);
		}
	}
	class BadPaintBrush{
		public void doPaint(int i) {
			if(i==1) {
				RedPaint rp=new RedPaint();
				System.out.println("red paint...."+rp);
			}
			else if(i==2) {
				BluePaint bp=new BluePaint();
				System.out.println("blue paint...:"+bp);
			}
		}
	}