public class UseDepartment{
    public static void main(String[] args){
    Department dpt1 = new Department("Admin");
    System.out.println(Department.numberOfWorker);

    Department dpt2 = new Department("Finance");
    System.out.println(Department.numberOfWorker);
}
}