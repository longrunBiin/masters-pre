package week2.num3;

import java.util.Stack;

public class Maze {
    public static int[][] myMaze ={
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}

    };
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        boolean[][] visited = new boolean[8][8];
        Stack<Position> stack = new Stack<>();

        Position start = new Position(0, 0, null);
        Position end = new Position(7, 7, null);

        stack.push(start);
        visited[start.x][start.y] = true;

        Position destination = null;

        while (!stack.isEmpty()) {
            Position current = stack.pop();

            if (current.x == end.x && current.y == end.y) {
                destination = current;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (ny < 0 || nx < 0 || ny > end.y || nx > end.x) continue;
                if (!visited[ny][nx] && myMaze[ny][nx] == 0){
                    stack.push(new Position(nx, ny, current));
                    visited[ny][nx] = true;
                }
            }
        }
        if (destination != null) {
            System.out.print("(" + destination.x + "," + destination.y + ") ");
            while (destination != null) {
                System.out.print(" <- (" + destination.x + "," + destination.y + ") ");
                destination = destination.parent;
            }
        } else {
            System.out.println("경로가 없습니다.");
        }
    }

}
class Position{
    int x;
    int y;

    Position parent;
    public Position(int x, int y, Position parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }
}
