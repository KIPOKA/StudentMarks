/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.student;

import za.ac.tut.studentdata.StudentData;
import za.ac.tut.studentexception.StudentException;

/**
 *
 * @author acer
 */                            //A
public final class Student implements StudentData {
    private String studentNo;
    
    private int  testMark;

    
    private Student (){
       this.studentNo="00000";
       this.testMark=0;
        
    }
                                                               //B
    public Student(String studentNo, int testMark)throws StudentException {
                     //C
       setStudentNo(studentNo);
                    //D
       setTestMark(testMark);
    }
    public int getTestMark() {
        return testMark;
    }

    public void setTestMark(int testMark) {
        this.testMark = testMark;
    }

    public String getStudentNo() {
        return studentNo;
    }
                                                          //E
    public void setStudentNo(String studentNo) throws StudentException{
                             //F
        if(isStudentNoValid(studentNo)){
                           //G
        this.studentNo = studentNo;
    }else{
             //H
            throw new StudentException(ERROR_MSG +":"+studentNo);
        }
    
    }
           
    private boolean isStudentNoValid(String studentNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
