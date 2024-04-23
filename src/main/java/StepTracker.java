import java.util.ArrayList;
public class StepTracker
{
 private int min;
 private ArrayList<Integer> log;
 
 public StepTracket(int MIN){
  min = MIN;
  log = new ArrayList<Integer>();
 }

 public void addDailySteps(int steps){
  log.add(steps);
 }

 public int activeDays(){
  int count = 0;
  for (int day : log)
   if (day > min) count++;
  return count;
 }

 public double averageSteps(){
  double total = 0;
  for (int day : log)
   total += day;
  return total/log.size();
 }
} 
