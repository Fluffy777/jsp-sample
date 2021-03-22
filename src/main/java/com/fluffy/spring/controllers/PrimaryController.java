package com.fluffy.spring.controllers;

import com.fluffy.spring.beans.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.Queue;

@Controller
public class PrimaryController {
    private Queue<Operation> operations = new LinkedList<>();

    private ModelAndView buildOperationModelAndView(int one, int two, Operation.OperationType type) {
        Operation operation = new Operation(one, two, type);
        operations.add(operation);
        if (operations.size() > 10) {
            operations.poll();
        }
        return new ModelAndView("result", "operation", operation);
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(name = "one") int one, @RequestParam(name = "two") int two) {
        return buildOperationModelAndView(one, two, Operation.OperationType.ADD);
    }

    @RequestMapping("/subtract")
    public ModelAndView sub(@RequestParam(name = "one") int one, @RequestParam(name = "two") int two) {
        return buildOperationModelAndView(one, two, Operation.OperationType.SUB);
    }

    @RequestMapping("/multiply")
    public ModelAndView mul(@RequestParam(name = "one") int one, @RequestParam(name = "two") int two) {
        return buildOperationModelAndView(one, two, Operation.OperationType.MUL);
    }

    @RequestMapping("/divide")
    public ModelAndView div(@RequestParam(name = "one") int one, @RequestParam(name = "two") int two) {
        return buildOperationModelAndView(one, two, Operation.OperationType.DIV);
    }

    @RequestMapping("/operations")
    public ModelAndView operations() {
        return new ModelAndView("operations", "list", operations);
    }
}
