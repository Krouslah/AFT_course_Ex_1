package Utility;

public class Ex1_3 {
    private int hours;
    private int min;
    private int sec;
    private String user;

    public Ex1_3(int hours, int min, int sec, String user) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
        this.user = user;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 24) this.hours = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >= 0 && min <= 60) this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec >= 0 && sec <= 60) this.sec = sec;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String dayTime(int a, int b, int c) {
        if (hours >= 5 && hours <= 12) {
            if (min > 0 && min <= 59) {
                if (sec > 0 && sec <= 59) {
                    return "Доброе утро, ";
                }
            }
        }
        if (hours >= 12 && hours <= 16) {
            if (min > 0 && min <= 59) {
                if (sec > 0 && sec <= 59) {
                    return "Добрый день, ";
                }
            }
        }
        if (hours >= 16 && hours <= 23) {
            if (min > 0 && min <= 59) {
                if (sec > 0 && sec <= 59) {
                    return "Добрый вечер, ";
                }
            }
        }
        if (hours >= 23 && hours <= 5) {
            if (min > 0 && min <= 59) {
                if (sec > 0 && sec <= 59) {
                    return "Доброй ночи, ";
                }
            }
        }
        return "Проверь введенное время, ";
    }
}
