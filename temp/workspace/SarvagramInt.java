package workspace;

import java.util.Objects;

public class SarvagramInt {

    public static void main(String[] args) {

//        Empl e1 = new Empl(1,"raj");
//        Empl e2 = new Empl(2,"amit");
//        Empl e3 = new Empl(3,"ravi");
//        Empl e4 = new Empl(3,"tejas");
//
//        Map<Empl,Integer> map = new HashMap<>();
//        map.put(e1,e1.getId());
//        map.put(e2,e2.getId());
//        map.put(e3,e3.getId());
//        map.put(e4,e4.getId());
//
//        map.keySet().stream()
//                .sorted(Comparator.comparing(empl -> empl.getName())).forEach(System.out::println);
//
//        EmploeeBuilder emploeeBuilder = new EmploeeBuilder(new Empl());
//        emploeeBuilder.id(4);
//        emploeeBuilder.name("");

//   -------------------------------------------------------------
        // find first and second highest
        int[] arr = {55, 68, 2, 5, 10};
        int firstmax = 0;
        int secondmax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > firstmax) {
                secondmax = firstmax;
                firstmax = arr[i];

            }
            if (arr[i] > secondmax && (firstmax > arr[i])) {
                secondmax = arr[i];
            }
            i++;

        }
        System.out.println("Firstmax:" + firstmax);
        System.out.println("Secondmax:" + secondmax);


    }
}

class EmploeeBuilder {
    Empl e;

    public Empl id(Integer id) {

        e.setId(id);
        return e;
    }

    public Empl name(String name) {
        e.setName(name);
        return e;

    }

    EmploeeBuilder(Empl e) {
        this.e = e;
    }
}

class Empl {

    Integer id;
    String name;

    Empl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empl empl)) return false;
        return Objects.equals(getId(), empl.getId()) && Objects.equals(getName(), empl.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Empl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Empl(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
