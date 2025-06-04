package app;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department findAll ===");
        List<Department> departmentList = departmentDao.findAll();
        for (Department obj : departmentList) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: Department insert ===");
        Department newDepartment = new Department(null, "RH");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! newDepartment id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: Department update ===");
        department = departmentDao.findById(4);
        department.setName("CEOs");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: Department deleteById ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();

    }
}
