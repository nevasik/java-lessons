package HomeWork1;

public class Room extends Home {
    boolean passOrNot;

    public Room(boolean passOrNot) {
        this.passOrNot = passOrNot;
    }

    public boolean isPassOrNot() {
        return passOrNot;
    }

    @Override
    public void print(){
        if (passOrNot == true){
            System.out.println("Комната проходит");
        }
        else {
            System.out.println("Комната не проходит");
        }
    }
}
