
class Demo{

        String name;
        int rollno;
        String branch;
        public void studentdetails(String name,int rollno,String branch) {
            System.out.println("Student name: " +name+ "\t" + "Roll no: " + rollno + "\t " + "Branch" + branch);
        }
 }

     class Main{
                public static void main(String[] args){

                     Demo object =new Demo();
                    object.studentdetails("sowmya",20,"ECE");

                }
        }
