package schach;

import java.util.ArrayList;

public class Bishop extends Chessman {
	
	public Bishop(Position pos) {
		super(pos);
	}

	@Override
	public ArrayList<Position> getMoveList() {
		ArrayList<Position> moveList = new ArrayList<Position>();
		Position nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getX() + 1, nextPosition.getY() + 1);
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}

		nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getX() - 1, nextPosition.getY() + 1);
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}

		nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getX() + 1, nextPosition.getY() - 1);
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}

		nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getX() - 1, nextPosition.getY() - 1);
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}
		
		return moveList ;
	}

	@Override
	public String toString() {
		return "Bishop: " + this.getPosition();
	}

}
