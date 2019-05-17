package bit;

public class BitMain {
	public static void main(String[] args) {
		System.out.println("Is opposite sign : " + BitHelper.isOppSign(5, -3));
		
		System.out.println("Number of set bits in number 5 : " + BitHelper.countSetBit(5));
		
		System.out.println("Number of set bits in all numbers until 5: " + BitHelper.countSetBitsInAllNumbersUntilN(5));
	}
}	
