package Level2;

/**
 * @author lenovo
 */
public class Penguin extends Pet{
    @Override
    public void play(Pet pet) {
        System.out.println("企鹅在游泳戏水。");
    }

    @Override
    public void state() {
        this.setName("小白");
        this.setHealth(80);
        this.setLovey(30);
        System.out.println(getName()+"体力值减20：体力值="+(getHealth()-20));
        System.out.println("与主人亲密度加10：亲密度="+(getLovey()+10));
    }

    @Override
    public void eat() {
        System.out.println("企鹅吃鱼。");
    }
}
