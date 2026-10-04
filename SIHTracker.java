import java.util.ArrayList;
import java.util.Scanner;

public class SIHTracker
{

    static class Problem
    {
        String statementId;
        String statementTitle;
        String tayalRemark;

        Problem(String id, String title, String remark)
        {
            this.statementId = id;
            this.statementTitle = title;
            this.tayalRemark = remark;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Problem> tayalProblemCollection = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Problem | 2. View All | 3. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1)
            {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Title: "); String title = sc.nextLine();
                System.out.print("Remark: "); String remark = sc.nextLine();
                tayalProblemCollection.add(new Problem(id, title, remark));
            } else if (choice == 2)
            {
                for (Problem p : tayalProblemCollection)
                {
                    System.out.println("[" + p.statementId + "] " + p.statementTitle + " -> " + p.tayalRemark);
                }
            }
        } while (choice != 3);
    }
}
