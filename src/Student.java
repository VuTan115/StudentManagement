public class Student {
    private String name, id, group, email;

    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.email = email;
        this.group = group;
        this.id = id;
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getGroup() {
        return this.group;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    public Student(Student std) {
        this.name = std.getName();
        this.id = std.getId();
        this.group = std.getGroup();
        this.email = std.getEmail();
    }
}
