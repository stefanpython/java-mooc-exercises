import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<Exercise> exerciseList() {
        return this.exercises;
    }

    public void add(String exerciseName) {
        this.exercises.add(new Exercise(exerciseName));
    }

    public void markAsCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                exercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName) && exercise.isCompleted()) {
                return true;
            }
        }
        return false;
    }
}
