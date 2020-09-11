public class StudentManagement {
  private Student[] students;
  private int length;

  public StudentManagement() {
    this.students = new Student[100];
    this.length = 0;
  }

  public static boolean sameGroup(Student s1, Student s2) {
    return s1.getGroup().equals(s2.getGroup());
  }

  public void addStudent(Student newStudent) {
    if (students[0] == null) {
      students[0] = newStudent;
      length++;
    } else {
      students[length] = newStudent;
      length++;
    }
  }

  public String studentsByGroup() {
    boolean[] check = new boolean[length];
    for (int i = 0; i < length; i++) {
      check[i] = false;
    }
    String group = "";
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < length; i++) {
      group = students[i].getGroup();

      if (!check[i]) {
        ans.append(group).append("\n");
        for (int j = 0; j < length; j++) {
          if (students[j].getGroup().equals(group)) {
            ans.append(students[j].getInfo()).append("\n");
            check[j] = true;
          }
        }
      }
    }
    return ans.toString();
  }

  public void removeStudent(String id) {
    int index = 0;
    for (int i = 0; i < length; i++) {
      if (students[i].getId().equals(id)) {
        index = i;
        if (index == length - 1) {
          students[index] = null;
          length = length - 1;
        } else {
          for (int j = index; j < length; j++) {
            students[j] = students[j + 1];
          }
          length = length - 1;
        }
        break;
      }
    }
  }

  public static void main(String[] args) {
    StudentManagement sM = new StudentManagement();
    Student Nguyen_Van_An = new Student(
      "Nguyen Van An",
      "17020001",
      "K62CC",
      "17020001@vnu.edu.vn"
    );
    Student B = new Student(
      "Nguyen Van B",
      "17020002",
      "K62CC",
      "17020002@vnu.edu.vn"
    );
    Student C = new Student(
      "Nguyen Van C",
      "17020003",
      "K62CB",
      "17020003@vnu.edu.vn"
    );
    Student D = new Student(
      "Nguyen Van D",
      "17020004",
      "K62CB",
      "17020004@vnu.edu.vn"
    );

    Student E = new Student(
      "Nguyen Van E",
      "17020001",
      "K62CD",
      "17020001@vnu.edu.vn"
    );
    Student F = new Student(
      "Nguyen Van F",
      "17020002",
      "K62CD",
      "17020002@vnu.edu.vn"
    );
    Student G = new Student(
      "Nguyen Van G",
      "17020003",
      "K62CA",
      "17020003@vnu.edu.vn"
    );
    Student H = new Student(
      "Nguyen Van H",
      "17020004",
      "K62CA",
      "17020004@vnu.edu.vn"
    );
    sM.addStudent(Nguyen_Van_An);
    sM.addStudent(B);
    sM.addStudent(C);
    sM.addStudent(D);
    sM.addStudent(E);
    sM.addStudent(F);
    sM.addStudent(G);
    sM.addStudent(H);
    System.out.println(sM.sameGroup(Nguyen_Van_An, D));
    sM.removeStudent("17020003");
    System.out.println(sM.studentsByGroup());
  }
}
