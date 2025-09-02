Employee Management System (Console)

Language: Java

IDE: Eclipse

Overview
A console-based Employee Management System that allows adding Managers and Developers, listing all employees, and finding the employee with the highest salary. Built to demonstrate object-oriented concepts (classes, inheritance, encapsulation, polymorphism) and basic Java data handling.


Features

Add employees (Manager, Developer)

List all employees

Find the employee with the highest salary

Menu-driven console interface


Project structure

EmployeeManagementSystem/ 
├─ src/ # Java source files
│ └─ com/your/package/... 
├─ slides/ # (optional) screenshots / slides
├─ README.md
└─ .gitignore


How to run (Eclipse)

Import the project: File → Import → Existing Projects into Workspace → select project folder → Finish.

Right-click the class containing public static void main → Run As → Java Application.

Use the Console view to interact with the menu.

How to run (command line)


# from project root

javac -d bin src/com/your/package/*.java

java -cp bin com.your.package.MainClass


