public  abstract class Duck {
    public Duck() {

    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    public void swim(){
        System.out.println("Estoy nadando, incluso puedo flotar");

    }

    public void fly(){
        String str = "estoy volando...";
        System.out.println(str);
    }
    public abstract void display();

    public void quack(){

        System.out.println("cuack quack");
    }

}
