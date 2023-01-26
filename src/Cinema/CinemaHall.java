package Cinema;

public class CinemaHall {
    private int numberOfRows;
    private int numberOfCols;
    private char[][] grid;

    public CinemaHall(int numberOfRows, int numberOfCols) {
        this.numberOfRows = numberOfRows;
        this.numberOfCols = numberOfCols;
        this.grid = new char[numberOfRows][numberOfCols];
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfCols() {
        return numberOfCols;
    }

    public void setNumberOfCols(int numberOfCols) {
        this.numberOfCols = numberOfCols;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        grid = grid;
    }


    public void initializeGridWithEmptySeats() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                grid[i][j] = 'e';
            }
        }
    }
}
