public class App {
    public void methodInMaster(){
        System.out.println("Revision 1 in Master");
        System.out.println("Revision 2 in Master");
        System.out.println("Revision 4 in Master");
        System.out.println("Revision 6 in Master");
    }

    public void methodInBranch(){
        System.out.println("Revision 3 in Branch");
        System.out.println("Revision 5 in Branch");
    }
}