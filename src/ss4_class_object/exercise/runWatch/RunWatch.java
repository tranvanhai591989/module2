package ss4_class_object.exercise.runWatch;

public class RunWatch {
    private long startTime ,stopTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }
    public void start(){
        setStartTime(System.currentTimeMillis());
    }
    public  void stop(){
        setStopTime(System.currentTimeMillis());
    }
    public long getElapsedTime(){
        return getStopTime()-getStartTime();
    }
}


