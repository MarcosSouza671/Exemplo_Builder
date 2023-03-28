package construct;

public class MazeBuilder {
    private int room;
    private int roomFrom;
    private int roomTo;

	public MazeBuilder() {}

    public MazeBuilder buildMaze() {
        return null;
    }

    public MazeBuilder buildRoom(int room) {
        this.room = room;
        return this;
    }

    public MazeBuilder buildDoor(int roomFrom, int roomTo) {
        this.roomFrom = roomFrom;
        return this;
    }

    public User build() {
        return new User(room, roomFrom, roomTo);
    }
}
