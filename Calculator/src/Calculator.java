
public class Calculator {

	private int count;
	
	public Calculator() {
		this.count = 0;
	}
	
	public void add(int number) {
		count += number;
	}
	
	public void subtract(int number) {
		count -= number;
	}
	
	public void multiply(int number) {
		count *= number;
	}
	
	public void divide(int number) {
		count /= number;
	}
	
	public int getCount() {
		return count;
	}
	
	public void reset() {
		this.count = 0;
	}
	
}
