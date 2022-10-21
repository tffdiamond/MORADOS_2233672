package something.tutorials;
import javax.swing.*;
public class GradesJoptionPane1 {
        public static void main(String[] args) {
            double grade1;
            double grade2;
            double grade3;

            grade1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your grade for your first exam"));
            grade2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your grade for your second exam"));
            grade3 = Double.parseDouble(JOptionPane.showInputDialog("Enter your grade for your third exam"));

            double averageGrade = (grade1 + grade2 + grade3) / 3;

            if(averageGrade>= 75.0)
            {
                JOptionPane.showMessageDialog(null,"Your average grade of " + averageGrade+" is within the passing score");
            }
            else
            {
                JOptionPane.showMessageDialog(null,":-( Your average grade is "+ averageGrade);
            }
        }
}
