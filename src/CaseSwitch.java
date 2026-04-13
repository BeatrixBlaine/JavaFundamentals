public class CaseSwitch {
    static void main(String[] args) {

        var nilai = "A";

        // basic
        switch (nilai) {

            case "A":
                System.out.println("Kamu lulus!");
                break;
            case "B":
            case "C":
                System.out.println("Kamu lulus biasa!");
                break;
            case "D":
                System.out.println("Kamu tidak lulus!");
                break;
            default:
                System.out.println("Salah jurusan!");
        }

        // lambda
        switch (nilai) {

            case "A" -> System.out.println("Luar biasa!");
            case "B", "C" -> System.out.println("Sangat baik!");
            case "D" -> System.out.println("Remedial!");
            default -> {
                System.out.println("Masukan nilai yang valid!");
            }

        }

        // yield version (java 14 ++)
        String greeting = switch (nilai) {
            case "A":
                yield "Selamat ya!";
            case "B", "C":
                yield "Keep up the good work!";
            case "D":
                yield "Anda kurang beruntung";
            default:
                yield "Aneh";
        };

        System.out.println(greeting);
    }
}
