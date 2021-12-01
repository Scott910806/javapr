public class pr01
{
    public static void main(String[] args) {
        /*
        var score = 'C';
        switch(score){
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
        */
        String season = "summer";
        switch(season){
            case "spring":
                System.out.println("春暖花开");
                break;
            case "winter":
                System.out.println("凛冬已至");
                break;
            default:
                System.out.println("error");
        }

        // 循环
        var count = 0;
        while (count < 10){
            System.out.println(count);
            count ++ ;
        }
        System.out.println("循环结束");
    }
}