package Animal;

/**
 * Created by Админ on 14.11.2016.
 */
public class Cat extends Animal implements IInform {


    public String getClassName() {
        return "Cat";
    }

    public int getAge() {
        return 7;
    }

    public String Say() {
        return "Meow-Meow";
    }


}
