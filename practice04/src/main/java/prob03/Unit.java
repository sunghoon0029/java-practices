package prob03;

public class Unit {
	private int x, y;

	public Unit() {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		/* 지정된 위치로 이동 */
		System.out.println("지정된 위치로 이동");
	}
	
	public void stop() {
		/* 현재 위치에 정지 */
		System.out.println("현재 위치에 정지");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
