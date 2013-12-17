package schach;

public class Position {
	
	private int posx, posy;

	public Position(int posx, int posy) {
		super();
		this.posx = posx;
		this.posy = posy;
	}
	
	public int getX() {
		return posx;
	}

	public int getY() {
		return posy;
	}
	
	public boolean isValid(){
		return posx > 0 && posx < 9 && posy > 0 && posy < 9;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Position other = (Position) obj;
		if (posx != other.posx) return false;
		if (posy != other.posy) return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + posx + "/" + posy + ")";
	}
}
