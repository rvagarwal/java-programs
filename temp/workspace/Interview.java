package workspace;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Interview {

    public static void main(String[] args){

        // sort employee by name desc then by value ascending
        Employee e1 = new Employee("a","q");
        Employee e2 = new Employee("b","w");
        List<Employee> employees = List.of(e1, e2);
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed().thenComparing(Employee::getValue))
                .collect(Collectors.toList());
                System.out.println(sortedEmployees);


    }
}

class Employee{
    private String name;
    private String value;

    public Employee(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    //generate tostring as json
    @Override
    public String toString(){
        return "{\"name\":\""+this.name+"\", \"value\":"+this.value+"}";
    }


}
