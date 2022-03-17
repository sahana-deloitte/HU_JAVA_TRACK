public class Animal {
    public static void main(String args[]) {
        Animal1 a = new Animal1();
        a.setname("Fish");
        a.setfood("shrimp");
        a.setlifespan(25);
        System.out.println(a.getname()+" favorite food is\t"+a.getfood() +" and it lifespan is\t"+a.getlifespan());
    }
}
class Animal1{
    private String name;
    private String food;
    private int lifespan;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getfood(){
        return food;
    }
    public void setfood(String food){
        this.food=food;
    }
    public int getlifespan(){
        return lifespan;
    }
    public void setlifespan(int lifespan){
        this.lifespan=lifespan;
    }
}
