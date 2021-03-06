package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class FriendTracker {
    //radomly generate a String id;
    public static String getRandomString(){
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        return s;
    }
    private static ArrayList<Friend> friendArrayList = new ArrayList<>();

    public static ArrayList<Friend> getFriendArrayList() {
        return friendArrayList;
    }

    public static void addFriend (String id, String name, String email, String birthday){
        friendArrayList.add(new Friend(id,name,email,birthday));
    }

    public static void deleteFriend (int position){
        friendArrayList.remove(position);
//        for(int i = 0; i < friendArrayList.size(); i ++) {
 //           if (friendArrayList.get(i).getId().equals(id))
  //              friendArrayList.remove(i);
  //      }
    }

    public static String getName(int index){
        return friendArrayList.get(index).getName();
    }
    public static String getEmail(int index){
        return friendArrayList.get(index).getEmail();
    }
    public static String getBirthday(int index) {return friendArrayList.get(index).getBirthday();}

    public static int listCount(){
        return friendArrayList.size();
    }

}
