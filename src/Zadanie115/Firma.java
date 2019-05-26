package Zadanie115;

    public class Firma {

        private String nazwa;
        private Student[] listaStudentow = new Student[10];


        Firma(String nazwa) {
            this.nazwa = nazwa;
        }

        public boolean dodajStudentaDoFirmy(Student student) {
            boolean czyDodano = false;

            for (int i = 0; i < listaStudentow.length; i++) {
                if (listaStudentow[i] == null) {
                    listaStudentow[i] = student;
                    czyDodano = true;
                    break;
                }
            }

            return czyDodano;

        }

        public StringBuilder zwrocListeStudentow() {
            StringBuilder out = new StringBuilder();

            for (int i = 0; i < listaStudentow.length; i++) {
                if(listaStudentow[i] != null){
                    out.append(listaStudentow[i]).append("\n");
                }
            }

            return out;
        }

        public Student najlepiejZarabiajacy() {
            Student max = listaStudentow[0];

            for (int i = 1; i < listaStudentow.length ; i++) {
                if (listaStudentow[i] != null) {
                    if (listaStudentow[i].getPensja() > max.getPensja()) {
                        max = listaStudentow[i];
                    }
                }
            }

            return max;

        }

        public int najstarszyStudent() {
            int maxWiek = 0;

            for (int i = 0; i < listaStudentow.length ; i++) {
                if (listaStudentow[i] != null) {
                    if (listaStudentow[i].getWiek() > maxWiek) {
                        maxWiek = listaStudentow[i].getWiek();
                    }
                }
            }

            return maxWiek;
        }

        public int liczbaStudentowStarszaNiz(int wiek) {
            int counter = 0;
            for (int i = 0; i < listaStudentow.length; i++) {
                if(listaStudentow[i] != null) {
                    if (listaStudentow[i].getWiek() > wiek) {
                        counter++;
                    }
                }
            }

            return counter;
        }

        public void przyznaniePodwyzkiProcentowej(int procent) {

            for (int i = 0; i < listaStudentow.length; i++) {
                Student student = listaStudentow[i];
                if (student != null) {
                    student.setPensja(
                            student.getPensja() + (student.getPensja() * procent / 100)
                    );
                }
            }

        }


    }