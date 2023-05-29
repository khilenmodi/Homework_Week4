package encapsulation26;

public class TestEncapsulation {
    public static void main (String[] args){
        Encapsulate obj = new Encapsulate();
        // setting value of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        // displaying values of the variables

        System.out.println("prime's name : " + obj.getName());
        System.out.println("prime's age : " + obj.getAge());
        System.out.println("prime's rollNo :" + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
        // system.out.println("prime's rollNo : " + Obj.geekName):
    }
}
