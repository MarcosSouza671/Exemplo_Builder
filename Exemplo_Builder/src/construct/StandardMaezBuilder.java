package construct;

public class StandardMaezBuilder : public MazeBuilder {

	public MazeBuilder() {}

    public MazeBuilder buildMaze() ;

    public MazeBuilder buildRoom(int) ;

    public MazeBuilder buildDoor(int, int) ;

    public User build() {
        Direction CommonWall(int room1, int room2);
        
    }
}
