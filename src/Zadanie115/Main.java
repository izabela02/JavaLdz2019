package Zadanie115;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(
                "Jarek",
                "Nowak",
                Plec.MEZCZYZNA ,
                26,
                3500
        );


        Student student2 = new Student(
                "Marek",
                "Nowakk",
                Plec.MEZCZYZNA ,
                23,
                3000
        );

        Student student3 = new Student(
                "Ewa",
                "Test",
                Plec.KOBIETA ,
                21,
                4000
        );

        Firma firma = new Firma("Nowa Sp. o.o.");
        firma.dodajStudentaDoFirmy(student1);
        firma.dodajStudentaDoFirmy(student2);
        firma.dodajStudentaDoFirmy(student3);

        System.out.println(firma.zwrocListeStudentow());

//        System.out.println(firma.najlepiejZarabiajacy());
//
//        System.out.println(firma.najstarszyStudent());
//
//        System.out.println(firma.liczbaStudentowStarszaNiz(2));

        firma.przyznaniePodwyzkiProcentowej(5);
        System.out.println();

        System.out.println(firma.zwrocListeStudentow());
    }

}