package database;

import models.Room;

import java.util.HashMap;

public class RoomDatabase {
    HashMap<String, Room> roomDatabase;
    public RoomDatabase(){
        this.roomDatabase=new HashMap<>();
    }
    public Room getUnoccupiedRoom(){

        for(String key:roomDatabase.keySet()){
            Room room=roomDatabase.get(key);
            if(!room.isOccupied()){
                return room;
            }
        }
        return null;
    }
    public int getTotalRooms(){
        return  roomDatabase.size();
    }
    public void addRoomToDb(Room room){
        String roomId=room.getRoomId();
        roomDatabase.put(roomId,room);
    }
}
