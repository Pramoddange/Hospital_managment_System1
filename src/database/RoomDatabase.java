package database;

import models.Room;

import java.util.HashMap;

public class RoomDatabase {
    HashMap<Integer, Room> roomDB;
    RoomDatabase(){
        this.roomDB=new HashMap<>();
    }
}
