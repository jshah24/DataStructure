import java.util.*;
import java.io.*;

public class PuzzleSolve {

	public static String[] DICTIONARY = { "OX", "CAT", "TOY", "AT", "DOG",
			"CATAPULT", "T" };

	static boolean IsWord(String testWord)

	{

		if (Arrays.asList(DICTIONARY).contains(testWord))

			return true;

		return false;

	}

	public static int finalWords(char[][] puzzle) {
		// int count=traversePositiveXAxis(puzzle,3,3)+
		// traversePositiveYAxis(puzzle,3,3)+
		// traverseNegativeXAxis(puzzle,3,3)+
		// traverseNegativeYAxis(puzzle,3,3);
		int row = puzzle.length;
		int column = puzzle[0].length;
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				count += traversePositiveXAxis(puzzle, i, j)
						+ traverseNegativeYAxis(puzzle, i, j)
						+ traversePositiveYAxis(puzzle, i, j)
						+ traverseNegativeXAxis(puzzle, i, j)
						+ traversePositiveXPositiveY(puzzle, i, j)
						+ traverseNegativeXNegativeY(puzzle, i, j)
						+ traverseNegativeXPositiveY(puzzle, i, j)
						+ traversePositiveXNegativeY(puzzle, i, j);
			}
		}

		// int count=traversePositiveXAxis(puzzle,0,0);
		return count;

	}

	public static int traversePositiveXAxis(char[][] ch, int row, int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;

		for (int i = column; i < ch[row].length; i++) {
			builder.append(ch[row][i]);
			// System.out.println(builder.toString());
			if (IsWord(builder.toString())) {
				count++;

			}

		}
		return count;
	}

	public static int traversePositiveYAxis(char[][] chars, int row, int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;

		for (int i = row; i >= 0; i--) {
			builder.append(chars[i][column]);
			// System.out.println(builder.toString());
			if (builder.length() > 1) {
				if (IsWord(builder.toString())) {
					count++;
				}
			}
		}
		return count;

	}

	public static int traverseNegativeXAxis(char[][] ch, int row, int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = column; i >= 0; i--) {
			builder.append(ch[row][i]);
			if (builder.length() > 1) {

				if (IsWord(builder.toString())) {
					count++;

				}
			}
		}
		return count;

	}

	public static int traverseNegativeYAxis(char[][] ch, int row, int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = row; i < ch[column].length; i++) {
			builder.append(ch[i][column]);
			if (builder.length() > 1) {
				if (IsWord(builder.toString())) {
					count++;

				}
			}
		}
		return count;

	}

	public static int traversePositiveXPositiveY(char[][] ch, int row,
			int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = row, j = column; i < ch.length && j < ch[i].length; i++, j++) {

			builder.append(ch[i][j]);
			// System.out.println(builder.toString());
			if (builder.length() > 1) {
				if (IsWord(builder.toString()))

				{
					count++;
				}
			}
		}

		return count;
	}

	public static int traverseNegativeXNegativeY(char[][] ch, int row,
			int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {

			builder.append(ch[i][j]);
			// System.out.println(builder.toString());
			if (builder.length() > 1) {
				if (IsWord(builder.toString())) {
					count++;
				}
			}

		}
		return count;
	}

	public static int traverseNegativeXPositiveY(char[][] ch, int row,
			int column) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = row, j = column; i >= 0 && j < ch.length; i--, j++) {

			builder.append(ch[i][j]);
			if ((builder.length() > 1)) {
				if (IsWord(builder.toString()))

				{
					count++;
				}
			}
		}

		return count;

	}

	public static int traversePositiveXNegativeY(char[][] ch, int row,
			int column) {

		StringBuilder builder = new StringBuilder();
		int count = 0;
		for (int i = row, j = column; i < ch.length && j > 0; i++, j--) {

			builder.append(ch[i][j]);
			if (builder.length() > 1) {
				if (IsWord(builder.toString()))

				{
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// char[][] puzzle = { { 'C', 'A', 'T' }, { 'X', 'Z', 'T' },
		// { 'Y', 'O', 'T' } };
		 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows");
		int row = sc.nextInt();
		System.out.println("Enter number of Columns");
		int column = sc.nextInt();
		char[][] puzzle = new char[row][column];
		System.out.println("Enter the values: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				String words = sc.next();
				//System.out.println(words);
				puzzle[i][j] = words.charAt(0);	
			}
		}
		//System.out.println(puzzle);
		PuzzleSolve p = new PuzzleSolve();
		 System.out.println( p.finalWords(puzzle));

	}

}
