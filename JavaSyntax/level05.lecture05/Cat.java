/**
 * Бои двух котов
 * @author Luminescensse
 * @version 1.0
 */
public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;

        if (age > 0 && age < 15) {
            this.age = age;
        } else  {
            throw new IllegalArgumentException("the age should be from 1 to 14");
        }

        if (weight > 0 && weight < 7) {
            this.weight = weight;
        } else  {
            throw new IllegalArgumentException("the weight should be from 1 to 6");
        }

        if (strength > 0 && strength < 10) {
            this.strength = strength;
        } else  {
            throw new IllegalArgumentException("the strength should be from 1 to 9");
        }
    }

    public boolean fight(Cat anotherCat) {
        if (anotherCat.age == this.age && anotherCat.strength == this.strength
            && anotherCat.weight == this.weight) {
            throw new IllegalArgumentException("At least one parameter must be different");
        }
        
        if (Math.abs(anotherCat.strength - this.strength) > 1) {
            if (anotherCat.strength < this.strength) {
                return true;
            } else {
                return false;
            }
        } else if (Math.abs(anotherCat.age - this.age) > 4) {
            if (anotherCat.age > this.age) {
                return true;
            } else {
                return false;
            }
        } else if (Math.abs(anotherCat.weight - this.weight) > 1) {
            if (anotherCat.weight > this.weight) {
                return true;
            } else {
                return false;
            }
        } else {
            //if (anotherCat.strength < this.strength || anotherCat.age > this.age || anotherCat.weight > this.weight) {
            //    return true;
            //} else {
            //    return false;
            //}
            int run = (int) (Math.random() * 10);
            if (run < 6) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        try {
            Cat cat1 = new Cat("Vaska", 9, 2, 7);
            Cat cat2 = new Cat("Murka", 5, 1, 6);
            System.out.println(cat1.fight(cat2));
            System.out.println(cat2.fight(cat1));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        }
    }
}
