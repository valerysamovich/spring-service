/**
 * @file JSONEncodeDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/19/2014
 *
 * Greeting representation class with resources.
 */

package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false,
            defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
