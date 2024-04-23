import java.util.ArrayList;
public class StepTracker
{
 private ArrayList<Integer> log;
 private int min;

 public StepTracker(int minimum){
  min = minimum;
  log = new ArrayList<Integer>();
 }

 public void addDailySteps(int steps){
  log.add(steps);
 }

 public int activeDays(){
  int count = 0;
  for (int day : log)
   if (day >= min) count++;
  return count;
 }

 public double averageSteps(){
  if (log.size() == 0) return 0;
  double total = 0;
  for (int day : log)
   total += day;
  return total/log.size();
 }
} 
