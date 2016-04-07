public class State {
	
	private int x;
	private int y;
	private int reward;
	private State up;
	private State down;
	private State left;
	private State right;

	public State(int x, int y, int reward) {
		this.x = x;
		this.y = y;
		this.reward = reward;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}	

	public State getUp() {
		return up;
	}

	public State getDown() {
		return down;
	}

	public State getLeft() {
		return left;
	}

	public State getRight() {
		return right;
	}

	public void setUp(State up) {
		this.up = up;
	}

	public void setDown(State down) {
		this.down = down;
	}

	public void setLeft(State left) {
		this.left = left;
	}

	public void setRight(State right) {
		this.right = right;
	}

	public int getReward() {
		return reward;
	}

}