package Soal3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Uji coba metode compare secara langsung
        System.out.println("--- Uji Coba Metode compare() ---");
        int hasilCompare = staff[0].compare(staff[1]);
        System.out.println("Perbandingan Gaji Antonio dan Maria: " + hasilCompare);
        if (hasilCompare == -1) {
            System.out.println("Gaji Antonio lebih KECIL dari Maria\n");
        }

        // Menaikkan gaji staf
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        System.out.println("--- Data Karyawan Sebelum Diurutkan ---");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }

        // Menggunakan shell_sort dari class Sortable
        Sortable.shell_sort(staff);

        System.out.println("\n--- Data Karyawan Setelah Diurutkan (Berdasarkan Gaji) ---");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}
