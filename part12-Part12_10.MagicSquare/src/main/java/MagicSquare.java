
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sumList = new ArrayList<>();

        for (int row = 0; row < this.square.length; row++) {
            int rowSum = 0;

            for (int col = 0; col < this.square[row].length; col++) {
                rowSum += this.square[row][col];
            }

            sumList.add(rowSum);
        }

        return sumList;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumList = new ArrayList<>();

        // Loop through each column index
        for (int col = 0; col < this.square[0].length; col++) {
            int colSum = 0;

            // Loop through each row in the current column and add the values
            for (int row = 0; row < this.square.length; row++) {
                colSum += this.square[row][col];
            }

            // Add the sum of the current column to the sumList
            sumList.add(colSum);
        }

        return sumList;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumList = new ArrayList<>();

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < this.square.length; i++) {
            // Summing the primary diagonal (top-left to bottom-right)
            primaryDiagonalSum += this.square[i][i];

            // Summing the secondary diagonal (top-right to bottom-left)
            secondaryDiagonalSum += this.square[i][this.square.length - 1 - i];
        }

        // Add the sums to the list
        sumList.add(primaryDiagonalSum);
        sumList.add(secondaryDiagonalSum);

        return sumList;
    }
    
    

// ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
    
    public MagicSquare createMagicSquare(int size) {
        MagicSquare magicSquare = new MagicSquare(size);
        int n = size;
        int number = 1;
        
        // Start position: middle of the top row
        int row = 0;
        int col = n / 2;

        while (number <= n * n) {
            // Place the current number
            magicSquare.placeValue(col, row, number);

            // Move to the next position (up one row and right one column)
            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;

            // Check if the next position is already occupied
            if (magicSquare.readValue(newCol, newRow) != 0) {
                // If the cell is occupied, move down one row from the original position
                newRow = (row + 1) % n;
                newCol = col;
            }

            // Update row and column to the new position
            row = newRow;
            col = newCol;

            // Increment the number to place
            number++;
        }

        return magicSquare;
    }
}
