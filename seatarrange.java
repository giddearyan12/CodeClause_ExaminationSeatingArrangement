import java.util.*;
public class seatarrange {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of students: ");
int numStudents = sc.nextInt();
System.out.print("Enter the number of rows: ");
int numRows = sc.nextInt();
System.out.print("Enter the number of columns: ");
int numCols = sc.nextInt();
int numSeats = numRows * numCols;
if (numStudents > numSeats) {
    System.out.println("There are not enough seats for all the students!");
    return;
}
int[][] seatingArrangement = new int[numRows][numCols];
int studentNumber = 1;
for (int i = 0; i < numRows; i++) 
{
    for (int j = 0; j < numCols; j++) 
    {
        if (studentNumber <= numStudents) 
        {
            seatingArrangement[i][j] = studentNumber;
            studentNumber++;
        }
    }
}
System.out.println("Seating Arrangement:");
for (int i = 0; i < numRows; i++) 
{
    for (int j = 0; j < numCols; j++) 
    {
        if (seatingArrangement[i][j] == 0) 
        {
            System.out.print(" ");
        }
        else 
        {
            System.out.printf("%2d ", seatingArrangement[i][j]);
        }
    }
    System.out.println();
}
}
}