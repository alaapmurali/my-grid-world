public class Action {
	
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right; 

	public Action(boolean up, boolean down, boolean left, boolean right) {
		if (up == true) {
			this.up = true;
		} else if (down == true) {
			this.down = true;
		} else if (left == true) {
			this.left = true;
		} else {
			this.right = true;
		}
	}

	public void setUp() {
		this.up = true;
	}

	public void setDown() {
		this.down = true;
	}

	public void setLeft() {
		this.left = true;
	}

	public void setRight() {
		this.right = true;
	}

	public boolean getUp() {
		return up;
	}

	public boolean getDown() {
		return down;
	}

	public boolean getLeft() {
		return left;
	}

	public boolean getRight() {
		return right;

}