// вложение класса в метод

public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args){
        Parcel5 p = new Parcel5();
        Destination destination = p.destination("Танзания");
        System.out.println(destination.readLabel());
    }
}
