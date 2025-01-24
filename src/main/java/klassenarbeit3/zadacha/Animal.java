package klassenarbeit3.zadacha;

public class Animal {
    private String name;
    private String voice;
    private String food;
    private String location;

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }
    public String getName() {
        return name;
    }
    public void makeNoise() {
        System.out.println("eto zivotnoe izdaet zvuk " + getVoice());
    }

    public void eat() {
        System.out.println("eto zivotnoe est " + getFood());
    }

    public void sleep() {
        System.out.println("eto zivotnoe spit " + getLocation());
    }

}
//Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит
//        переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например,
//может выводить на консоль "Такое-то животное издаёт звук". Dog, Cat, Horse переопределяют методы makeNoise,
//eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных, если придумаете .
//Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив
// типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.