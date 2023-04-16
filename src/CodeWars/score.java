package CodeWars;

public class score {
    public static void main(String[] args) {
        String[] arr = {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"};
        System.out.println(points(arr));
    }
    public static int points(String[] games) {
        int sum = 0;
        for(String s : games){
            int x = Integer.parseInt(s.split(":", 2)[0]);
            int y = Integer.parseInt(s.split(":", 2)[1]);
            if (x>y){
                sum+=3;
            }
            if (x==y){
                sum+=1;
            }

        }
        return sum;
    }
}
