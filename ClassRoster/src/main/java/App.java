/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jobep.classroster.controller.ClassRosterController;
import com.jobep.classroster.dao.*;
import com.jobep.classroster.ui.*;
/**
 *
 * @author powel
 */
public class App {
    public static void main(String[] args){
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao,myView);
        controller.run();
    }
}
