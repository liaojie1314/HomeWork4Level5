package Level2;

import java.util.Scanner;

/**
 * @author lenovo
 */
public class Master {
    public void play(Pet pet){
        if(pet instanceof Dog){
            Dog dog=(Dog) pet;
            dog.play(pet);
            dog.eat();
            dog.state();
        }else {
            Penguin penguin=(Penguin) pet;
            penguin.play(pet);
            penguin.eat();
            penguin.state();
        }
    }
    public static void main(String[] args){
        Master master=new Master();
        System.out.println("请选择陪哪只小动物玩：dog/penguin");
        Scanner scanner=new Scanner(System.in);
        String ani=scanner.next();
        if("dog".equals(ani)) {
            Pet pet = new Dog();
            master.play(pet);
        }else if("penguin".equals(ani)){
            Pet pet=new Penguin();
            master.play(pet);
        }
    }
}