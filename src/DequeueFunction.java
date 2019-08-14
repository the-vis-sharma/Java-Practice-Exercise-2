

public interface DequeueFunction {
	
	public boolean push(DequeChild item);
	
	public DequeChild pop();

}
