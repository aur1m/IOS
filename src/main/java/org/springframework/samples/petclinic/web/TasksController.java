package org.springframework.samples.petclinic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @autor a.garelik
 * Date: 03/12/13
 * Time: 23:29
 */
@Controller
@SessionAttributes("visit")
public class TasksController extends AbstractBaseController {

    @RequestMapping(value = "*/tasks/{taskId}", method = RequestMethod.GET)
    public String processTask(@PathVariable int taskId) {
        return "tasks/processTask";
    }
}
