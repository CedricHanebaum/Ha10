package schach;

import java.util.ArrayList;

public class Rook extends Chessman{

	public Rook(Position pos) {
		super(pos);
	}

	@Override
	public ArrayList<Position> getMoveList() {
		ArrayList<Position> moveList = new ArrayList<Position>();
		Position nextPosition = this.getPosition();
		
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getPosx() + 1, nextPosition.getPosy());
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}

		nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getPosx() - 1, nextPosition.getPosy());
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}
		
		nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getPosx(), nextPosition.getPosy() + 1);
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}
		
		nextPosition = this.getPosition();
		while(nextPosition.isValid()){
			nextPosition = new Position(nextPosition.getPosx(), nextPosition.getPosy() - 1);
			if(nextPosition.isValid()) moveList.add(nextPosition);
		}
		
		return moveList;
	}

	@Override
	public String toString() {
		return "Rook " + this.getPosition();
	}

}
