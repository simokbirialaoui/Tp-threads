package Exercice1.metier;

public class Talkative implements Runnable{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Talkative(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(id);
        }
    }
}
