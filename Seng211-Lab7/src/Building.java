public class Building {
    private String name;
    private Room roomType;
    private int numOfRooms;
    private Owner[] owners;

    public Building(String name, Room roomTyoe, int numOfRooms){
        this.name = name;
        this.roomType = roomTyoe;
        this.numOfRooms = numOfRooms;
    }

    public Building(String name, Room roomTyoe, int numOfRooms, Owner[] owners){
        this.name = name;
        this.roomType = roomTyoe;
        this.numOfRooms = numOfRooms;
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoomType() {
        return roomType;
    }

    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public Double getTotalArea(){
        return numOfRooms*roomType.getSizeM2();
    }

    public Owner[] getOwners(){
        return owners;
    }

    public void DisplayAllOwners(){
        for (int i=0;i<owners.length;i++){
            System.out.println("Name: "+owners[i].getName()+" Date: "+owners[i].getDate());
        }
    }
}
