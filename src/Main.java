public class Main {

    public static void main(String[] args) {
        // Napisz  program,  który  pobierze  od  użytkownika  10  dowolnie  dużych  liczb (zmiennych typu int) i wypisze te,
        // które wystąpiły minimum dwukrotnie.

        Zadanie15 zadanie15 = new Zadanie15();
        Number[] numbers = zadanie15.getNumbers();
        zadanie15.printNumbers(numbers);
    }
}