package repast.simphony.statecharts;

public class SimpleState extends State {

	private State parent;
	
	@Override
	public void enterState() {
		if (hasParent()){
			getParent().enterStateFromChild();
		}
		initializeState();
	}

	@Override
	public void exitState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State getParent() {
		return parent;
	}

	@Override
	public Boolean hasParent() {
		return parent != null;
	}

	@Override
	public void initializeState() {
		System.out.println("Simple state: " + getId() + "initialized");
	}


}
