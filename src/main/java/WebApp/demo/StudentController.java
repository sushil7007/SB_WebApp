package WebApp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import WebApp.model.Student;

@Controller
public class StudentController {

@GetMapping("/getStudent")
public String getStudent(Model model) {
Student s=new Student(101, "Mahesh", 76, "Pune");
model.addAttribute("stu",s);
return "student";
}}