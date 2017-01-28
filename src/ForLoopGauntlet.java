
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 2; i < 102; i++) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		for (int i = 100; i > -1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i < 101; i++) {
			System.out.print(i++ + " ");
		}
		System.out.println();
		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.print(i +"even ");
			}
			if (i%2==1){
				System.out.print(i +"odd ");
			}
			
		}
		System.out.println();
		for (int i = 0; i < args.length; i++) {

		}
		System.out.println();
		for (int i = 1; i < 778; i++) {
			if(i%7==0){
				System.out.print(i +" ");
			}
		}
	}
}
