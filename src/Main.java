public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // Задание 1
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Ты ещё не совершеннолетний, но осталось совсем немного)))");
        }
        // Домашнее задание 1
        // Задание 2
        System.out.println(" ");
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 2");
        int ageChild = 7;
        if (ageChild >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        int ageTeenager = 19;
        if (ageTeenager >= 18) {
            System.out.println("Подросток уже закончил школу и может отправляться в университет");
        }
        int ageHuman = 25;
        if (ageHuman >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Домашнее задание 1
        // Задание 3
        System.out.println(" ");
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 3");
        int passengersInTheTrainCarriage = 102;
        int seats = 61;
        int standingPlaces = passengersInTheTrainCarriage - seats;
        if (passengersInTheTrainCarriage >= 102) {
            System.out.println("Вагон полностью забит");
        }
        if (seats < 60) {
            System.out.println("Есть свободные сидячие места.");
        }
        if (seats >= 60) {
            System.out.println("Нет свободных сидячих мест");
        }
        if (standingPlaces < 42) {
            System.out.println("Есть свободные стоячие места.");
        }
        if (standingPlaces >= 42) {
            System.out.println("Нет свободных стоячих мест");
        }
        // Домашнее задание 2
        // Задание 1
        System.out.println(" ");
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
        // Домашнее задание 2
        // Задание 2
        System.out.println(" ");
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 2");
        int ageChild1 = 7;
        if (ageChild1 >= 7 && ageChild1 <= 17) {
            System.out.println("Ребенок ходит в школу");
        } else if (ageChild1 >= 18 && ageChild1 <= 23) {
            System.out.println("Подросток уже закончил школу и может отправляться в университет");
        } else if (ageChild1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Домашнее задание 2
        // Задание 3
        System.out.println(" ");
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 3");
        int place1 = 59;
        if (place1 >= 0 && place1 <= 59) {
            System.out.println("Есть свободные сидячие места.");
        } else if (place1 >= 60 && place1 <= 101) {
            System.out.println("Есть свободные стоячие места.");
        } else if (place1 >= 102) {
            System.out.println("Вагон полностью забит.");
        }
        // Домашнее задание 3
        // Задание 1
        System.out.println(" ");
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int age2 = 27;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else if (age2 > 18 && age2 < 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }
        // Домашнее задание 3
        // Задание 2
        System.out.println(" ");
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 2");
        int age3 = 14;
        if (age3 <= 5) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
        } else if (age3 > 5 && age3 < 14) {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age > 14) {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
        }
        // Домашнее задание 3
        // Задание 3
        System.out.println(" ");
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 3");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && two > free) {
            System.out.println(one);
        } else if (two > one && two > free) {
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }
    }
