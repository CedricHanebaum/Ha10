package schach;

import java.util.ArrayList;

public abstract class Chessman {
	
	private Position pos;

	public Chessman(Position pos) {
		super();
		this.pos = pos;
	}
	
	public Position getPosition(){
		return pos;
	}
	
	public void moveTo(Position pos){
		if(!pos.isValid()) throw new RuntimeException();
		this.pos = pos;
	}
	
	public abstract ArrayList<Position> getMoveList();

	public boolean canMoveTo(Position pos){
		return this.getMoveList().contains(pos);
	}
	
}
