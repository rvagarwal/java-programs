package workspace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

 class LTIc2 {



    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        //add  elements to the list
        list.add(new Emp("John", 5000, "workspace.A"));
        list.add(new Emp("Jane", 7000, "workspace.A"));
        list.add(new Emp("Doe", 8500, "workspace.A"));
        list.add(new Emp("Alice", 8000, "workspace.C"));
        list.add(new Emp("Jacob", 9000, "workspace.C"));


        // get the employee with highest salary from each  grade and print their details using stream
        System.out.println("\nworkspace.Employee with Highest Salary in Each Department:");
        list.stream()
                .collect(Collectors.groupingBy(Emp::getGrade))
                .values().stream()
                .map(dept -> dept.stream().max(Comparator.comparingInt(Emp::getSalary)))
                .map(nullSafeEmp -> nullSafeEmp.get())
                .forEachOrdered(System.out::println);


















    }
}
class Emp {
    String name;
    Integer salary;
    String grade;


    public Emp(String name, Integer salary, String grade) {
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp emp)) return false;
        return Objects.equals(getName(), emp.getName()) && Objects.equals(getSalary(), emp.getSalary()) && Objects.equals(getGrade(), emp.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getGrade());
    }

    @Override
    public String toString() {
        return "workspace.Emp [name=" + name + ", salary=" + salary + ", grade=" + grade + "]";
    }

}
