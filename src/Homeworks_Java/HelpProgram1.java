package Homeworks_Java;

import java.util.Scanner;
public class HelpProgram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Help:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("6. break");
            System.out.println("7. continue");

            System.out.println("Choose one: ");

            // Получаем выбор пользователя
            String choice = scanner.next();

            // Если пользователь ввел 'q', завершаем программу
            if (choice.equals("q")) {
                break;
            }
            int option = Integer.parseInt(choice);
            if (option < 1 || option > 7) {
                System.out.println("Выберите правильный пункт меню (1-7):");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("if(condition) statement;");
                    System.out.println("else statement;");
                    break;
                case 2:
                    System.out.println("switch(expression) {");
                    System.out.println("case constant:");
                    System.out.println("statement sequence");
                    System.out.println("break;");
                    System.out.println("// ...");
                    System.out.println("}");
                    break;
                case 3:
                    System.out.println("for(init; condition; iteration) {");
                    System.out.println("statement;");
                    System.out.println("}");
                    break;
                case 4:
                    System.out.println("while(condition) {");
                    System.out.println("statement;");
                    System.out.println("}");
                    break;
                case 5:
                    System.out.println("do {");
                    System.out.println("statement;");
                    System.out.println("} while (condition);");
                    break;
                case 6:
                    System.out.println("break; or break label;");
                    break;
                case 7:
                    System.out.println("continue; or continue label;");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
