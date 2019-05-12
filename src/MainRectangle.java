public class MainRectangle {
    public static void main(String[] args) {

        Rectangle one = new Rectangle(20, 15);
        Rectangle two = new Rectangle(20,15);
        Rectangle three = new Rectangle(20,15);
        Rectangle four = new Rectangle(20,15);

        System.out.println(one.czyTakieSame(two));
        System.out.println(Rectangle.czyTakieSame2(one, two));
        System.out.println(Rectangle.czyTakieSame3(one, two, three));

    }
    }

