package Week4;

public class Elseif {
public static void main(String[]args) {

    int x = 21;
    int y = 21;
    int z = 65;

    if (x<=y && x<z) {
        System.out.println("Young man");
    }else if (x>y && x<z) {
        System.out.println("Middle aged");
    }else{
        System.out.println("Retired");
    }
}
}
