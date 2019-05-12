public class zadanie94 {
    public static void main(String[] args) {
        String regex = "[0-9]{9}|([0-9]{3}-[1-9]{3}-[0-9]{3})"; // jeśli zastosujemy {} to sprawdzi to 1 raz
        String phone = "695045763";
        System.out.println("695045763".matches(regex));
        System.out.println("695-145-763".matches(regex));
        System.out.println("695-045763".matches(regex));


    }
}
