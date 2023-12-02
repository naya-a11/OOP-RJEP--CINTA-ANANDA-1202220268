import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bank bank = new bank();
        Scanner input = new Scanner(System.in);
        List<account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Akun");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System. out.println("4. Hapus Akun");
            System.out.println("5. Tampilkan Semua Akun");
            System.out.println("6. Keluar");

            System.out.print("Pilihan: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Akun: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan Saldo Awal Akun: ");
                    double initialBalance = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Nomor Akun (NIM): ");
                    String accountNumber = input.nextLine();
                    account newAccount = new account(name, accountNumber, initialBalance);
                    bank.addAccount(newAccount);
                    accounts.add(newAccount);
                    break;

                case 2:
                    System.out.print("Masukkan Nomor Akun yang akan melakukan Setoran: ");
                    String depositAccountNumber = input.nextLine();
                    account depositAccount = bank.getAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Masukkan Jumlah Uang yang akan Disetor: ");
                        double depositAmount = input.nextDouble();
                        input.nextLine();
                        depositAccount.deposit(depositAmount);
                        System.out.println("Saldo Akun " + depositAccount.getName() + " setelah menyetor: " + depositAccount.getBalance());
                    } else {
                        System.out.println("Akun tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan Nomor Akun yang akan melakukan Penarikan: ");
                    String withdrawAccountNumber = input.nextLine();
                    account withdrawAccount = bank.getAccount(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Masukkan Jumlah Uang yang akan Ditarik: ");
                        double withdrawAmount = input.nextDouble();
                        input.nextLine();
                        boolean success = withdrawAccount.withdraw(withdrawAmount);
                        if (success) {
                            System.out.println("Saldo Akun " + withdrawAccount.getName() + " setelah menarik uang: " + withdrawAccount.getBalance());
                        } else {
                            System.out.println("Saldo tidak mencukupi untuk penarikan tersebut.");
                        }
                    } else {
                        System.out.println("Akun tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nomor Akun yang akan dihapus: ");
                    String deleteAccountNumber = input.nextLine();
                    account deleteAccount = bank.getAccount(deleteAccountNumber);
                    if (deleteAccount != null) {
                        String deletedAccountName = deleteAccount.getName();
                        bank.removeAccount(deleteAccount);
                        accounts.remove(deleteAccount);
                        System.out.println("Akun " + deletedAccountName + " berhasil dihapus!");
                    } else {
                        System.out.println("Akun tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Daftar Semua Akun dalam Bank:");
                    for (account account : accounts) {
                        System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
                    }
                    break;

                case 6:
                    System.out.println("Terima kasih! Selamat datang kembali.");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}