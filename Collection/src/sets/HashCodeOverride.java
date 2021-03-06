package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	  
    private int eid;
    private String ename;
   
    public Employee(int eid, String ename) {
          this.eid = eid;
          this.ename = ename;
    }
    @Override
    public String toString() {
          return "eid = " + eid + ", ename = " + ename ;
    }
   
    		/* overriding equals method saying even if two objects are having same eid and ename still they are not equal */
   public boolean equals(Object obj) {
        
   if( this.eid==((Employee)obj).eid && this.ename==((Employee)obj).ename)
          return false;
   
          return false;
    }
   
   /*			 overriding hashcode() method to generate hashcode based on its eid*/
   public int hashCode() {
          return this.eid;
    }
}


public class HashCodeOverride {

	public static void main(String[] args) {
        Set<Employee> test=new HashSet<Employee>();
        Employee t1=new Employee(1,"sushil");
        System.out.println(" System Hascodes : "+ System.identityHashCode(t1)+"\tOur Hashcode t1-- "+t1.hashCode());
        Employee t2=new Employee(2,"rajeev");
        System.out.println(" System Hascodes : "+ System.identityHashCode(t2)+"\tOur Hashcode t2-- "+t2.hashCode());
        Employee t3=new Employee(3,"amit");
        System.out.println(" System Hascodes : "+ System.identityHashCode(t3)+"\tOur Hashcode t3-- "+t3.hashCode());
        Employee t4=new Employee(4,"veena");
        System.out.println(" System Hascodes : "+ System.identityHashCode(t4)+"\tOur Hashcode t4-- "+t4.hashCode());
        Employee t5=new Employee(1,"sushil");
        System.out.println(" System Hascodes : "+ System.identityHashCode(t5)+"\tOur Hashcode t5-- "+t5.hashCode());
        
        System.out.println("..................................");
       
        test.add(t1);
        test.add(t2);
        test.add(t3);
        test.add(t4);
        test.add(t5);

        Iterator<Employee> its=test.iterator();
        while(its.hasNext())
       {
/*             Employee value=(Employee)its.next();
             System.out.println("Value :"+value);*/
        	System.out.println(its.next());
        
       }
}
}
