import java.util.*;

public class ComparingStrategy {

//    private class employeeComparator implements Comparator<Employee>{
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//
//    }



    private class Employee implements Comparable<Employee> {
        int empId;
        String name;

        Employee(int empId, String name){
            this.empId = empId;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return empId == employee.empId && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(empId, name);
        }

        public int getEmpId() {
            return empId;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Employee o) {
            return name.compareTo(o.getName());
        }


    }

    void print(){
        Employee e1 = new Employee(8,"Ram");
        Employee e2 = new Employee(2, "shyam");
        Employee e4 = new Employee(1, "HSR");
        Employee e3 = new Employee(3,"Ram");

        List<Employee> list = new ArrayList<>();
        list.add(e1);list.add(e2);list.add(e4);list.add(e3);

        Collections.sort(list);

        System.out.println(list);
    }
}
