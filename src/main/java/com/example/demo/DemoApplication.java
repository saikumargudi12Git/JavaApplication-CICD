package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
        Java Spring Boot Application

        Successfully Deployed on Amazon EKS

        DevOps CI/CD Pipeline:
        GitHub Actions → Maven → Docker → Amazon ECR → Amazon EKS → Kubernetes

        AWS Services Used:
        ✔ Amazon ECR - Container Registry
        ✔ Amazon EKS - Kubernetes Cluster

        Optional Services (If Required by the Application):
        ✔ Amazon RDS - Relational Database
        ✔ Amazon S3 - Object Storage
        """;
    }
}
