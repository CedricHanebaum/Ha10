package schach;

import java.util.ArrayList;

public class Knight extends Chessman {

	public Knight(Position pos) {
		super(pos);
	}

	@Override
	public ArrayList<Position> getMoveList() {
		ArrayList<Position> tmpList = new ArrayList<Position>();
		for (int i = 1; i <= 8; i++) {
			// beschreibt das Zugmuster des Springers mit einem Kreis.
			int gegenkathete = (int) (Math.sin((Math.PI / (8 / 2)) * i + (Math.PI / 8)) * 2.7);
			int ankathete = (int) (Math.cos((Math.PI / (8 / 2)) * i + (Math.PI / 8)) * 2.7);
			Position tmpPos = new Position(gegenkathete + this.getPosition().getX(), ankathete + this.getPosition().getY());
			if (tmpPos.isValid()) {
				tmpList.add(tmpPos);
			}
		}
		return tmpList;
	}

	public String toString() {
		return "Knight: " + this.getPosition();
	}

}
