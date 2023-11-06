public class Mute implements iSound {

    public Mute() {
    }


    @Override
    public void makeSound() {
        System.out.println("no sound");

    }

    @Override
    public String toString() {
        return "Mute{}";
    }



}
