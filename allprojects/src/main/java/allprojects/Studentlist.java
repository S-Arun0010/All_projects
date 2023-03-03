package allprojects;
class Studentlist {
    String name;
    int age;
    double gpa;
   public Studentlist()
   {
       name = null;
       age = 0;
       gpa = 0.0;
   }
   public void setValue(String n,int a,double g)
   {
       this.name = n;
       this.age = a;
       this.gpa = g;
   }
   public String getName()
   {
       return this.name;
   }
   public int getAge()
   {
       return this.age;
   }
   public double getGpa()
   {
       return this.gpa;
   }

}