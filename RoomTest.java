
/**
 * Write a description of class RoomTest here.
 *
 * @author (Ally, BITA/6/22/010/TZ)
 * @version (a version number or a date)
 */
public class RoomTest
{
    public static void main(String[]args)
    {
        room defaultRoom = new room();
        System.out.println("Default room:" + defaultRoom);
        room customRoom = new room(8.5,11.5,2);
        System.out.println("Custom room:" + customRoom);
        
        defaultRoom.setWidth(15);
        defaultRoom.setLength(-5);
        defaultRoom.setFloor(3);
        System.out.println("Updated Default Room:" + defaultRoom);
    }
}
