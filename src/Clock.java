public class Clock {
    private int time;
    void setTime(int t)
    {if (t<0){
       System.out.println("time should be greater than zero");

    }
    else{
        time=t;
    }

    }
    int getTime() {
        return time;
    }

}
