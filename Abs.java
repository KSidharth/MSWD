abstract class Room
{
public abstract int seatingCapacity(int x);
}
class LectureHall extends Room
{
public int seatingCapacity(int y){
return y;}
}
class SeminarHall extends Room
{
public int seatingCapacity(int n){
return n;}
}
class Abs
{
public static void main(String args[])
{
LectureHall ob=new LectureHall();
System.out.println("LectureHall seating capacity="+ob.seatingCapacity(50));
SeminarHall obj=new SeminarHall();

System.out.println("SeminarHall seating capacity="+obj.seatingCapacity(600));
}
}