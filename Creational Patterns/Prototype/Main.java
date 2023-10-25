public class Main {
    public static void main(String[] args) {
        Employee e1 = new TempEmployee();
        e1.setId(1);
        e1.setName("Ahmed");
        e1.setAddress(new Address("Cairo", "Egypt"));

        Employee e2 = e1.DeepCopy();
        Employee e3 = e1.ShallowCopy();
        e1.setAddress(new Address("Alex", "Africa"));
        System.out.println(e1.getAddress());
        System.out.println(e2.getAddress());
        System.out.println(e3.getAddress());
    }
}