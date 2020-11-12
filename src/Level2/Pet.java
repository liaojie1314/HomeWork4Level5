package Level2;

    /**
     * @author lenovo
     */
    public abstract class Pet {
    private String name;
    private int health;
    private int lovey;
    public String getName(){
    return name;
}
   public void setName(String name){
    this.name=name;
   }
   public int getHealth(){
        return health;
   }
   public void setHealth(int health){
        this.health=health;
   }
   public int getLovey(){
        return lovey;
   }
   public void setLovey(int lovey){
        this.lovey=lovey;
   }
   public abstract void play(Pet pet);
   public abstract void state();
   public abstract void eat();
}
