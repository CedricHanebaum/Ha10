package schach;

import java.util.ArrayList;

public class Knight extends Chessman{

	public Knight(Position pos) {
		super(pos);
	}

	@Override
	public ArrayList<Position> getMoveList() {
		ArrayList<Position> tmp = new ArrayList<Position>();
		
		for (int i = 1; i <= 8; i++) {
			int gegenkathete = (int) (Math.sin((Math.PI / (8 / 2)) * i + (Math.PI/8)) * 2.7);
			int ankathete = (int) (Math.cos((Math.PI / (8 / 2)) * i + (Math.PI/8)) * 2.7);
			
			tmp.add(new Position(gegenkathete + this.getPosition().getX(), ankathete + this.getPosition().getY()));
		}
		for(int i = 0; i < tmp.size(); i++){
			if(tmp.get(i).getX() > 8 || tmp.get(i).getX() < 1 || tmp.get(i).getY() > 8 || tmp.get(i).getX() < 1){
				tmp.remove(i);
				i--;
			}
		}

		return tmp;
	}
	
	public String toString(){
		return "Knight: " + this.getPosition();
	}

}
