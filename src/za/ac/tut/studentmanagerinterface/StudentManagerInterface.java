/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.studentmanagerinterface;

import java.io.File;
import java.io.IOException;
import java.util.List;
import za.ac.tut.student.Student;
import za.ac.tut.studentexception.StudentException;

/**
 *
 * @author acer
 */
public interface StudentManagerInterface {//A
                                //B
public void storeStudentRecord(Student student,File file) throws IOException;// C

       //D                          //E
public List <Student> getStudents ( File file) throws IOException, StudentException; 

    //F                                             //G
public Student getstudent (String targetStudentNo, File file) throws IOException, StudentException;

                                //H             //I
public void changeStudentMarks ( Student student, File file) throws IOException, StudentException;

        //J                             //K
public double determineAverageTestMark(File file) throws IOException, StudentException;
        //L                                     //M
public Student determineStudentWithHighestMark( File file) throws IOException, StudentException;
}
