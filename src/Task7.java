public class Task7 {


    public static void task(){
/*
Напишите класс станка на заводе.
У станка есть наименование и количество остатка масла
для выполнения единиц деталей.
Станок может быть в статусе «Недоступен для работы»,
если для следующей работы не хватает единиц масла.
*/

        Machine machine = new Machine("Stanok", 500);
        machine.work(10);
        System.out.println(machine.text);
        machine.work(500);
        System.out.println(machine.text);
    }
}
