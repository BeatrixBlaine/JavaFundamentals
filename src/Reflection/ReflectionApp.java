package Reflection;

import AnnotationApp.CreateUserRequest;
import Exception.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Icad");
        request.setPassword("12345");

        ValidationUtil.validateReflection(request);

    }
}
