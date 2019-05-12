public class MainRownanie {

    public static void main(String[] args) {
        Równanie input1 = new Równanie(2,5,9);
        Równanie input2 = new Równanie(32,45,229);

        System.out.println(input1.equationValue());
        System.out.println(input2.equationValue());
        System.out.println(input1.equationValue(3));
        System.out.println(input1.equationValue(5));

    }
}
