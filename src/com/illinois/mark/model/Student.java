package com.illinois.mark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFacultyMemberName() {
        return facultyMemberName;
    }

    public void setFacultyMemberName(String facultyMemberName) {
        this.facultyMemberName = facultyMemberName;
    }

    public String getCourseNo1() {
        return courseNo1;
    }

    public void setCourseNo1(String courseNo1) {
        this.courseNo1 = courseNo1;
    }

    public String getCourseTitle1() {
        return courseTitle1;
    }

    public void setCourseTitle1(String courseTitle1) {
        this.courseTitle1 = courseTitle1;
    }
    public String getCourseNo2() {
        return courseNo2;
    }

    public void setCourseNo2(String courseNo2) {
        this.courseNo2 = courseNo2;
    }

    public String getCourseTitle2() {
        return courseTitle2;
    }

    public void setCourseTitle2(String courseTitle2) {
        this.courseTitle2 = courseTitle2;
    }

    public String getCourseNo3() {
        return courseNo3;
    }

    public void setCourseNo3(String courseNo3) {
        this.courseNo3 = courseNo3;
    }

    public String getCourseTitle3() {
        return courseTitle3;
    }

    public void setCourseTitle3(String courseTitle3) {
        this.courseTitle3 = courseTitle3;
    }

    public String getCourseNo4() {
        return courseNo4;
    }

    public void setCourseNo4(String courseNo4) {
        this.courseNo4 = courseNo4;
    }

    public String getCourseTitle4() {
        return courseTitle4;
    }

    public void setCourseTitle4(String courseTitle4) {
        this.courseTitle4 = courseTitle4;
    }

    public String getCourseCredit4() {
        return courseTerm4;
    }

    public void setCourseCredit4(String courseCredit4) {
        this.courseTerm4 = courseCredit4;
    }

    public String getCourseNo5() {
        return courseNo5;
    }

    public void setCourseNo5(String courseNo5) {
        this.courseNo5 = courseNo5;
    }

    public String getCourseTitle5() {
        return courseTitle5;
    }

    public void setCourseTitle5(String courseTitle5) {
        this.courseTitle5 = courseTitle5;
    }

    public String getCourseNo6() {
        return courseNo6;
    }

    public void setCourseNo6(String courseNo6) {
        this.courseNo6 = courseNo6;
    }

    public String getCourseTitle6() {
        return courseTitle6;
    }

    public void setCourseTitle6(String courseTitle6) {
        this.courseTitle6 = courseTitle6;
    }

    public String getCourseCredit6() {
        return courseTerm6;
    }

    public void setCourseCredit6(String courseCredit6) {
        this.courseTerm6 = courseCredit6;
    }
    
    

    public String getCourseTerm1() {
		return courseTerm1;
	}

	public void setCourseTerm1(String courseTerm1) {
		this.courseTerm1 = courseTerm1;
	}

	public String getCourseTerm2() {
		return courseTerm2;
	}

	public void setCourseTerm2(String courseTerm2) {
		this.courseTerm2 = courseTerm2;
	}

	public String getCourseTerm3() {
		return courseTerm3;
	}

	public void setCourseTerm3(String courseTerm3) {
		this.courseTerm3 = courseTerm3;
	}

	public String getCourseTerm4() {
		return courseTerm4;
	}

	public void setCourseTerm4(String courseTerm4) {
		this.courseTerm4 = courseTerm4;
	}

	public String getCourseTerm5() {
		return courseTerm5;
	}

	public void setCourseTerm5(String courseTerm5) {
		this.courseTerm5 = courseTerm5;
	}

	public String getCourseTerm6() {
		return courseTerm6;
	}

	public void setCourseTerm6(String courseTerm6) {
		this.courseTerm6 = courseTerm6;
	}



	@Id
    @Column
    private String studentId;

    @Column
    private String lastName;
    @Column
    private String firstName;
    @Column
    private String middleName;

    @Column
    private String email;
    @Column
    private String phone;

    @Column
    private String facultyMemberName;

    @Column
    private String courseNo1;
    @Column
    private String courseTitle1;
    @Column
    private String courseTerm1;

    @Column
    private String courseNo2;
    @Column
    private String courseTitle2;
    @Column
    private String courseTerm2;

    @Column
    private String courseNo3;
    @Column
    private String courseTitle3;
    @Column
    private String courseTerm3;

    @Column
    private String courseNo4;
    @Column
    private String courseTitle4;
    @Column
    private String courseTerm4;

    @Column
    private String courseNo5;
    @Column
    private String courseTitle5;
    @Column
    private String courseTerm5;

    @Column
    private String courseNo6;
    @Column
    private String courseTitle6;
    @Column
    private String courseTerm6;

}
