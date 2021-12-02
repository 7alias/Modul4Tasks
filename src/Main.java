public class Main {


    public static void main(String[] args) {


        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");


        System.out.println("The name of small cat is " + smallCat.getName());


        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");

        //изменять МОЖНО
        bigCat.setName("Kuzya");
        System.out.println(bigCat.getName());



    }
}