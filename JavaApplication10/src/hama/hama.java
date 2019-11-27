package hama;


public class hama {

    public static void main(String[] args) {
       
        
        id y = new id(313185015L, "3-6-2025");
        student k = new student("hama", y);
        System.out.println(k.name + "\t"+k.getID());


        Address  x=new Address( 15 , "ahmad", "slemani");
        techer h=new techer(212125,"unknown",x);
        System.out.println(h.studentName +"\t"+h.idNum  );
        
        
    }
    
}
