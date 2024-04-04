import java.util.ArrayList;
import java.util.HashMap;

class Project {
  String name;
  int daysToComplete;
  int deadline;

  public Project(String name, int daysToComplete, int deadline) {
    this.name = name;
    this.daysToComplete = daysToComplete;
    this.deadline = deadline;
  }

  public boolean isCompletedOnTime() {
    return daysToComplete <= deadline;
  }

  public boolean isCompletedEarly() {
    return daysToComplete < deadline;
  }
}

public class StudentProjectAnalysis {
  public static void main(String[] args) {
    ArrayList<Project> projects = new ArrayList<>();
    projects.add(new Project("Project A", 10, 12));
    projects.add(new Project("Project B", 8, 10));
    projects.add(new Project("Project C", 15, 14));

    int onTime = 0, late = 0, early = 0;
    double totalDays = 0;

    for (Project project : projects) {
      if (project.isCompletedOnTime()) {
        onTime++;
      } else if (project.isCompletedEarly()) {
        early++;
      } else {
        late++;
      }
      totalDays += project.daysToComplete;
    }

    double averageDays = totalDays / projects.size();

    System.out.println("Completed on time: " + onTime);
    System.out.println("Completed late: " + late);
    System.out.println("Completed early: " + early);
    System.out.println("Average time to complete: " + averageDays + " days");
  }
}
