public class UC3 {
    public static void main(String[] args){
        int full_time=1;
        int part_time=2;
        int empwage_Hour=20;
        int empwage=0;
        int randomNumber=(int)(Math.random()*3);
        if (randomNumber == full_time) {
            empwage_Hour = 8;
        } else if (randomNumber == part_time) {
            empwage_Hour = 4;
        }else {
            empwage_Hour = 0;
        }
        System.out.println("Added part time");
    }
}



