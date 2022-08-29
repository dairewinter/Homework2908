public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("До совершеннолетия придется подождать :(");
        }

        //task 2
        int personAge = 30;
        if (personAge >= 7 && personAge < 18) {
            System.out.println("Ты ходишь в школу");
        }
        if (personAge >= 18 && personAge < 24) {
            System.out.println("Ты закончил школу, пора в университет");
        }
        if (personAge >= 24) {
            System.out.println("Ты закончил университет, пора искать первую работу");
        }

        //task 3
        int wagonCapacity = 102;
        int seats = 60;
        int stand  = 45;
        if (wagonCapacity > 102) {
            System.out.println("Вагон полностью забит");
        }
        if (seats > 60) {
            System.out.println("Остались только стоячие места");
        }
        if (stand > (wagonCapacity - seats)) {
            System.out.println("Остались только сидячие места");
        }

        //task 4
        int age2 = 15;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("До совершеннолетия придется подождать :(");
        }

        //task 5
        int personAge2 = 30;
        if (personAge2 >= 7 && personAge2 < 18) {
            System.out.println("Ты ходишь в школу");
        } else if (personAge2 >= 18 && personAge2 < 24) {
            System.out.println("Ты закончил школу, пора в университет");
        } else if (personAge2 >= 24) {
            System.out.println("Ты закончил университет, пора искать первую работу");
        }

        //task 6
        int wagonCapacity2 = 102;
        int seats2 = 60;
        int stand2  = 45;
        if (wagonCapacity2 > 102) {
            System.out.println("Вагон полностью забит");
        } else if (seats2 > 60) {
            System.out.println("Остались только стоячие места");
        } else if (stand2 > (wagonCapacity2 - seats2)) {
            System.out.println("Остались только сидячие места");
        }

        //task 7
        int age3 = 34;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (age3 >=7 && age3 <= 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (age3 > 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        } else if (age3 > 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }

        //task 8
        int kidAge = 6;
        if (kidAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционах");
        } else if (kidAge > 5 && kidAge < 14) {
            System.out.println("Ребенок может кататься только в присутствии взрослого");
        } else if (kidAge > 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        //task 9
        int one;
        int two;
        int three;
        one = 3;
        two = 5;
        three = 10;
        if (one > two && one > three) {
            System.out.println(one + " - самое большое число");
        } else if (two > one && two > three) {
            System.out.println(two + " - самое большое число");
        }
        else if (three > one && three > two) {
            System.out.println(three + " - самое большое число");
        }
    }


    }