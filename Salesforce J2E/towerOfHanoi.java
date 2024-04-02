public class towerOfHanoi {
    public static void moveDisk(int n,char from_rod, char to_rod,char auxaliry_rod){
        if(n==1){
            System.out.println("Move disk from "+ from_rod +"To"+ to_rod);
            return;
        }
        moveDisk(n-1, from_rod,auxaliry_rod,to_rod);
        System.out.println("Move disk from "+ from_rod +"To"+to_rod);
        moveDisk(n-1, auxaliry_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        moveDisk(3, 'A', 'B', 'C');
    }
}
