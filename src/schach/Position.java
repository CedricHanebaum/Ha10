package schach;

/**Speichert eine Position auf einem Schachbrett. Unveraenderlich.
 * @author chanebaum, jlua, mzacharias
 *
 */

public class Position {
	
	/** x-,y-Koordinaten der zu speichernden Position*/
	private int posx, posy;

	public Position(int posx, int posy) {
		super();
		this.posx = posx;
		this.posy = posy;
	}
	
	/**Liefert die x-Position.
	 * @return die x-Position.
	 */
	public int getX() {
		return posx;
	}

	/**Liefert die y-Position.
	 * @return die y-Position.
	 */
	public int getY() {
		return posy;
	}
	
	/**Prueft, ob die Position auf dem Schachbrett liegt.
	 * @return true, wenn die Position auf dem Schachbrett liegt, false wenn nicht.
	 */
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
