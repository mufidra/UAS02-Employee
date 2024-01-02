/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas2_employe;

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * UAS NO 2
 */

//class Employee
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Employee is working.");
    }
}

//class Manager (manajer)
class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager is managing tasks.");
    }
}
//class Developer (pengembang)
class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }
}

//class Designer (desainer)
class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer is designing.");
    }
}

// main metode
public class UAS2_Employee {
    public static void main(String[] args) {
        // Membuat objek Manager
        System.out.println("=======  Manager =======");
        Manager manager = new Manager("Ariana");
        System.out.println("Manager Name: " + manager.getName());
        manager.work(); // Memanggil metode work() pada Manager

        System.out.println();

        // Membuat objek Developer
        System.out.println("=======  Developer =======");
        Developer developer = new Developer("William");
        System.out.println("Developer Name: " + developer.getName());
        developer.work(); // Memanggil metode work() pada Developer

        System.out.println();

        // Membuat objek Designer
        System.out.println("=======  Designer =======");
        Designer designer = new Designer("Terry");
        System.out.println("Designer Name: " + designer.getName());
        designer.work(); // Memanggil metode work() pada Designer
    }
}
