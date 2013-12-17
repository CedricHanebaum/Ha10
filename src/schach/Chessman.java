package schach;

import java.util.ArrayList;

/**Abstrakte Klasse als Vorlage zur Implementation von Schachfiguren.
 * @author chanebaum, jlua, mzacharias
 *
 */

public abstract class Chessman {
	
	/** Speichert ein aktuelle Position der Spielfigur.*/
	private Position pos;

	public Chessman(Position pos) {
		super();
		this.pos = pos;
	}
	
	/**Liefert das Positionsobjekt der Spielfigur.
	 * @return das Positionsobjeckt der Spielfigur.
	 */
	public Position getPosition(){
		return pos;
	}
	
	/**Bewegt die Spielfigur zur uebergebenen Position, falls die Position innerhalb des Spielfelds liegt und in einem Zug erreicht werden kann.
	 * @param pos setzt das Positionsobjekt der Figur auf dieses Objekt.
	 */
	public void moveTo(Position pos){
		if(!pos.isValid() || !this.canMoveTo(pos)) throw new RuntimeException();
		this.pos = pos;
	}
	
	/**Liefert eine Liste mit allen Positionsobjekten, zu denen die Spielfigur in einem Zug bewegt werden kann.
	 * @return eine Liste mit allen Positionsobjekten, zu denen die Spielfigur in einem Zug bewegt werden kann.
	 */
	public abstract ArrayList<Position> getMoveList();

	
	/**Prueft, ob die Spielfigur von ihrer aktuellen Position zur uebergebenen Position bewegt werden kann.
	 * @param pos repraesentiert die zu pruefende Position.
	 * @return true, falls die Position in einem Zug erreichbar ist, false wenn nicht.
	 */
	public boolean canMoveTo(Position pos){
		return this.getMoveList().contains(pos);
	}
	
}
