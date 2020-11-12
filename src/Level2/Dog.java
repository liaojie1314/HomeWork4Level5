package Level2;

/**
 * @author lenovo
 */
public class Dog extends Pet{
    @Override
    public void play(Pet pet) {
        System.out.println("狗狗玩飞盘。");
    }

    @Override
    public void state() {
        this.setName("大黄");
        this.setHealth(80);
        this.setLovey(60);
        System.out.println(getName()+"体力值减10：体力值="+(getHealth()-10));
        System.out.println("与主人亲密度加5：亲密度="+(getLovey()+5));
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃骨头。");
    }
}
