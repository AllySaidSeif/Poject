
/**
 * Write a description of class Mapinduz here.
 *
 * @author (Ally Said Seif)
 * @version (a version number or a date)
 */
public class Mapinduz
{
    private String name;
    private int day;
    private String month;
    
    public Mapinduz(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDay(int day){
        if(day>0)
            this.day=day;
        else
              this.day=0;
    }
    public int getDay(){
        return day;
    }
    
    public void setMonth(String month){
        this.month=month;
    }
    
    public String getMonth(){
        return month;
    }
    
    public String toString(){
        return name + " people of zanzibar celebrite of mapinduzi in the day " + day +" each year in " +month;
    }
    
    
}
