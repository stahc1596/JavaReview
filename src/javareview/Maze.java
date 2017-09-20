/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class Maze {

    public void printMaze(char[][] maze){
        for (int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println("");
        }
    }
    public boolean solveMaze(char[][] maze, int row, int col){
        //Am I off the map
        if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length){
            return false;
        }
        //Is this a bad spot?
        if(maze[row][col] == '+' || maze[row][col] == 'w'){
            return false;
        }
        //Did I find the end
        if(maze[row][col] == 'e'){
            printMaze(maze);
            return true;
        }
        //I'm on a valid location
        //Mark I've been here
        maze[row][col] = '+';
        //check north
        boolean check = solveMaze(maze, row - 1, col);
        if(check){
            return true;
        }
        //Check east
        check = solveMaze(maze, row, col + 1);
        if(check){
            return true;
        }
        check = solveMaze(maze, row + 1, col);
        if(check){
            return true;
        }
        check = solveMaze(maze, row, col - 1);
        if(check){
            return true;
        }
        //Spot no good
        //unmoving
        maze[row][col] = '.';
        return false;
    }
    public static void main(String[] args) {
        //char[][] maze = new char[10][10];
        char[][] maze = {{'w', 'w', 'w', 'w', '.', '.'},
                         {'s', '.', 'w', '.', 'w', '.'},
                         {'w', '.', 'w', '.', 'w', '.'},
                         {'w', '.', '.', '.', '.', '.'},
                         {'w', 'w', 'w', 'e', 'w', 'w'}};
        Maze test = new Maze();
        test.printMaze(maze);
        test.solveMaze(maze, 1, 0);
    }
}
