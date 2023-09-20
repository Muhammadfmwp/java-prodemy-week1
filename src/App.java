public class App {
    public static void main(String Args[]) throws Exception {
    MyDate tanggalLahir = new MyDate();
    tanggalLahir.setDay(31);
    tanggalLahir.setMonth(12);
    tanggalLahir.setYear(2002);

    Mahasiswa student = new Mahasiswa();
    student.setNim("A123011");
    student.setNama("Burhanudin");
    student.setTanggalLahir(tanggalLahir);

    System.out.println("=========Detail Mahasiswa==========");

    System.out.println(student);

    }
}
