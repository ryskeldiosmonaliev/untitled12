package org.example;

import org.example.madel.Dog;
import org.example.madel.House;
import org.example.madel.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ryskeldi
 * 1. Maven проект тузунуз (dependency spring context кошуп)
 * 2. Animal деген интерфейс тузуп, анын animalPlus жана animalMinus деген методдору болуш керек.
 * 3. Сиз кайсы жаныбарды жакшы корсонуз, ошого жараша класс тузуп,  свойствасына породасын, тусун ж.б.у.с. кошсонуз болот.  Сиз тузгон класс Animal интерфейсин реализация кылыш керек.
 * 4. Person деген класс тузуп, свойствасына animal, name, age бериниз.
 * 5. Main'ден spring колдонуп озунуздун жана жакын бир адамыныздын жакшы коргон жаныбарын консольго чыгарыныз
 * <p>
 * PS: bean'дер тузулуш керек жана маалыматтар application.properties файлга жазылыш керек.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("Person",Person.class);
        House house = context.getBean("Hourse",House.class);
        System.out.println(person);
        System.out.println(house);
        house.animalMinus();
        System.out.println("-------------------------------------------");
        Person person2 = context.getBean("Person2",Person.class);
        Dog dog = context.getBean("Dog",Dog.class);
        house.animamlPlus();
        System.out.println(person2);
        System.out.println(dog);
        dog.animamlPlus();
        dog.animalMinus();

    }
}
