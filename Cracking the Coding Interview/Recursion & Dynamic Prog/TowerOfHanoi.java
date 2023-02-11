import java.util.Stack;

public class TowerOfHanoi {
    public static long totalNumberOfMoves = 0;
    public static void main(String[] args) {
        Tower[] towers = new Tower[3];

        int numOfDisks = 5;

        for(int i=0; i<3; i++) {
            towers[i] = new Tower(i);
        }

        // add disks to tower 1
        for(int i=numOfDisks-1; i>=0; i--) {
            towers[0].add(i);
        }

        System.out.print("Tower 1:  ");
        for(int disk : towers[0].disks) {
            System.out.print(disk + " ");
        }

        towers[0].moveDisks(numOfDisks, towers[2], towers[1]);

        System.out.print("Tower 3:  ");
        for(int disk : towers[2].disks) {
            System.out.print(disk + " ");
        }
        System.out.println("\nTotal number of moves from Tower 1 to Tower 3: "+ 
            (towers[0].getNumOfMoves()+towers[1].getNumOfMoves()+towers[2].getNumOfMoves()));
        // System.out.println("\nTotal number of moves from Tower 1 to Tower 3: "+ 
        //     totalNumberOfMoves);
    }

    private static class Tower {
        private Stack<Integer> disks;
        private int index;
        private long numOfMoves = 0;
        
        public long getNumOfMoves() {
            return numOfMoves;
        }

        public Tower(int index) {
            disks = new Stack<Integer>();
            this.index =index;
        }

        // from this (current) tower move disks to destination using buffer tower
        public void moveDisks(int n, Tower destination, Tower buffer) {
            if(n <= 0) return;
            // first move n-1 disks to buffer, making 2nd tower as destination and using last tower buffer 
            moveDisks(n-1, buffer, destination);
            // move top disk of first tower to last tower
            moveTopTo(destination);
            // move n-1 disks in the buffer (2nd tower) to destination tower (last tower) making 1st (origin) tower as buffer
            buffer.moveDisks(n-1, destination, this);
        }

        private void moveTopTo(Tower destination) {
            if( disks.isEmpty()) return;
            int top = disks.pop();
            destination.add(top);
            numOfMoves++;
            totalNumberOfMoves++;
        }

        private void add(int disk) {
            if(!disks.isEmpty() && disks.peek() <= disk) {
                return;
            } else {
                disks.push(disk);
            }
        }
        

    }  
}


