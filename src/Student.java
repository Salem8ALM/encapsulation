public class Student {
    private String name;
    private int age;
    private double gpa;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa>0 && gpa<4){
            this.gpa = gpa;
        }
        else{
            this.gpa=0.0;
            System.out.println("provide a valid gpa");
        }

    }
    public String getGpaStatus(){
        if (gpa>3){
            return "Excelent!";
        }
        else if (gpa<= 3 && gpa>=2){
            return "Good.";
        }
        else{
            return "Needs Improvement.";
        }
    }
}
