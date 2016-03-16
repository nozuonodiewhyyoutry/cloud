package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;


@Controller
@RequestMapping("/file")
class FileController{
    @RequestMapping(path = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public Object upload(HttpServletRequest request)  {
        Part filePart = null;
        try {
            filePart = request.getPart("upload");
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
        } catch ( ServletException | IOException e){
            return false;
        }
       return true;
    }
}