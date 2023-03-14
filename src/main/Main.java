package main;

import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student lists[] = new Student[10];
        lists[0] = new Student(1, "nam", 22);
        lists[1] = new Student(2, "hieu", 20);
        lists[2] = new Student(3, "khiet", 21);
        do {
        System.out.println("1. Show List Student.");
        System.out.println("2. Create Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Sort Student By Age ASC (Tăng Dần).");
        System.out.println("6. Exit");
        System.out.println("nhập lựa chon của bạn: ");
        int chose = sc.nextInt();
        switch (chose) {
            case 1:
                for (int i = 0; i < lists.length; i++) {
                    if (lists[i] == null) {
                        continue;
                    } else
                        System.out.println(lists[i]);
                }
                break;
            case 2:
                System.out.println("nhap ten muon them");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("nhap tuoi");
                int age = sc.nextInt();
                for (int i = 0; i < lists.length; i++) {
                    if (lists[i] == null) {
                        lists[i] = new Student((lists[i - 1].id + 1), name, age);
                        break;
                    }
                }
                break;
            case 3:
                Student newList[] = new Student[lists.length];
                System.out.println("nhap id muon sua:");
                int idUp = sc.nextInt();
                if (lists[idUp-1] != null) {
                    sc.nextLine();
                    System.out.println("sua ten la: ");
                    String upName = sc.nextLine();
                    System.out.println("sua tuoi la: ");
                    int upAge = sc.nextInt();
                    lists[idUp - 1].name = upName;
                    lists[idUp - 1].age = upAge;
                } else {
                    System.out.println("khong co sinh vien muon sua");
                }
                break;
            case 4:
                System.out.println("nhap id cua sinh vien muon xoa");
                int idDel = sc.nextInt();
                for (int i = 0; i < lists.length; i++) {
                    if (lists[i]==null){
                        continue;
                    }
                    if (lists[i].id==idDel){
                        lists[i]=null;
                    }
                }
                break;
            case 5:
                Student temp;
                for (int i = 0; i < lists.length; i++) {
                    if (lists[i]==null){
                        continue;
                    }else {
                        for (int j = i + 1; j < lists.length; j++) {
                            if (lists[j]==null){
                                continue;
                            }else {
                            if (lists[i].age > lists[j].age) {
                                temp = lists[j];
                                lists[j] = lists[i];
                                lists[i] = temp;
                            }
                        }}
                    }
                }
                break;
            case 6:
                System.exit(0);
            default:
                break;
        }
        }while (true);
    }
}



