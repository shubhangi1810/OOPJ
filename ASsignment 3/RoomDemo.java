import java.util.Scanner;

 class Room {
    int height;
    int width;
    int breadth;

    Room() {
        height = 0;
        width = 0;
        breadth = 0;
    }

    Room(int height, int width, int breadth) {

        this.height = height;
        this.width = width;
        this.breadth = breadth;
        System.out.println("the volume of the given Room is :" + volume(height, width, breadth));
    }

    int volume(int height, int width, int breadth) {
        int volume = height * width * breadth;
        return volume;


    }

}

class RoomDemo {
    public static void main(String[] args) {
        Room obj = new Room();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rooms you want to check the volume of");
        int number = sc.nextInt();
        Room[] array = new Room[5];

        for (int i = 0; i < number; i++) {
            System.out.println("enter height ");
            int height = sc.nextInt();
            System.out.println("enter width ");
            int width = sc.nextInt();
            System.out.println("enter breadth ");
            int breadth = sc.nextInt();
            array[i] = new Room(height, width, breadth);
        }

    }
}