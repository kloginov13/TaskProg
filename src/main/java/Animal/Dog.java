package Animal;

/**
 * Created by Админ on 14.11.2016.
 */
public class Dog extends Animal implements IInform {
    public String getClassName() {
        return "Dog";
    }

    public int getAge() {
        return 5;
    }

    public String Say() {
        return "Gav-Gav";
    }
}
