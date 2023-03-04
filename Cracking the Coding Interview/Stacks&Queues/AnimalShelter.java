import java.util.LinkedList;

public class AnimalShelter {
    public class Animal {
        private int order;
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void setOrder(int order) {
            this.order = order;
        }
        public int getOrder() { return order; }

        public boolean isOlderThan(Animal animal) {
            return this.order > animal.order;
        }
    }
    public class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }
    }
    public class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    int currentOrder = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(currentOrder);
        currentOrder++;

        if(animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else {
            cats.addLast((Cat) animal);
        }
    }

    public Dog dequeueDog() {
        if(dogs.size() > 0) {
            return dogs.pollFirst();
        } else {
            return null;
        }
    }
    public Cat dequeueCat() {
        if(cats.size() > 0) {
            return cats.pollFirst();
        } else {
            return null;
        }
    }

    public Animal dequeueAny() {
        if(dogs.size() == 0) return dequeueCat();
        if(cats.size() == 0) return dequeueDog();
        
        Dog firstDog = dogs.peekFirst();
        Cat firstCat = cats.peekFirst();

        if(firstDog.isOlderThan(firstCat)) {
            return dogs.pollFirst();
        } else {
            return cats.pollFirst();
        }
    }

}
