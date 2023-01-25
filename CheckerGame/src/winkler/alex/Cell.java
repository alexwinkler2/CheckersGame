package winkler.alex;

/**
 * Represents the status of each location.
 * 
 * @author Hutchison
 * @version 1.0
 */

public class Cell {
	private CellState state;
	private Checker checker;
	private boolean hasChecker;

	/**
	 * Constructor with known state.
	 * 
	 * @param cs initial state
	 */
	public Cell(CellState cs) {
		state = cs;
		hasChecker = false;
	}

	/**
	 * Default constructor with empty state.
	 */
	public Cell() {
		state = CellState.EMPTY;
		hasChecker = false;
	}

	/**
	 * Change the state of a cell.
	 * 
	 * @param cs new state
	 */
	public void setState(CellState cs) {
		state = cs;
	}

	/**
	 * Check state of a cell
	 * 
	 * @return state of a cell
	 */
	public CellState getState() {
		return state;
	}

	/**
	 * String representation of a cell
	 */
	@Override
	public String toString() {
		switch (state) {
		case P1:
			return "O";
		case P2:
			return "X";
		case EMPTY:
			return "-";
		default:
			return "-";
		}
	}
}
