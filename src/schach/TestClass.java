package schach;

public class TestClass {
	
	public static void main(String[] args){
		Rook rook = new Rook(new Position(4, 5));
		System.out.println(rook);
		rook.moveTo(new Position(4, 1));
		System.out.println(rook);
		System.out.println(rook.getMoveList());
		

		Bishop bishop = new Bishop(new Position(5, 4));
		System.out.println(bishop);
		bishop.moveTo(new Position(6, 6));
		System.out.println(bishop);
		System.out.println(bishop.getMoveList());
		bishop.moveTo(new Position(8, 5));
		System.out.println(bishop.getMoveList());
	}

}