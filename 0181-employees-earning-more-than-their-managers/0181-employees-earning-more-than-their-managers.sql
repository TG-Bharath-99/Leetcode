SELECT a.name as Employee FROM Employee a JOIN Employee b on a.managerId=b.id WHERE a.salary>b.salary;
