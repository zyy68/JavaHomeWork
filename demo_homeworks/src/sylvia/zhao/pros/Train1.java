/**
 *
 *Train1.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年9月21日 上午11:08:55
 *
 */
package sylvia.zhao.pros;

/**
 * @author sylvia.zhao
 *
 */
public class Train1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a=10,c=23;
		boolean b = a>c;
		System.out.println("a>c"+b);
		
		String st1 = new String("how are you?");
		String st2 = new String("how are you?");
		String st3 = "how are you?";
		if(st1 == st2){
			System.out.println("st1 == st2"+true);
		}else{
			System.out.println("st1 == st2"+false);
			
		}

		//区别
		System.out.println("st1 == st2"+(st1.equals(st2)));
		System.out.println("st1 == st2"+(st1 == st2));
	}

}
