package com.backbenchcoders.cicdminiproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping
    public ResponseEntity<String> welcomePage() {
        String html = """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Welcome</title>
            <style>
                body {
                    margin: 0;
                    padding: 0 20px;
                    height: 100vh;
                    display: flex;
                    flex-direction: column;
                    justify-content: center;
                    align-items: center;
                    background: linear-gradient(135deg, #0f0c29, #302b63, #24243e);
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    color: #f0f0f0;
                    text-align: center;
                }

                h1 {
                    color: #ffff33;
                    font-size: 3rem;
                    padding: 20px 40px;
                    border: 2px solid #00ffff;
                    border-radius: 10px;
                    box-shadow: 0 0 20px #00ffff,
                                0 0 40px #00ffff,
                                0 0 60px #00ffff;
                    text-shadow: 0 0 2px #ffff33,
                                 0 0 20px #ffff33;
                    background-color: rgba(0, 0, 0, 0.3);
                    margin-bottom: 30px;
                }

                .description {
                    max-width: 800px;
                    background-color: rgba(255, 255, 255, 0.05);
                    padding: 20px;
                    border-radius: 10px;
                    box-shadow: 0 0 10px rgba(0, 255, 255, 0.3);
                }

                .description p {
                    font-size: 1.1rem;
                    line-height: 1.6;
                    color: #e0e0e0;
                }

                .highlight {
                    color: #00ffff;
                    font-weight: bold;
                }
            </style>
        </head>
        <body>
            <h1>Welcome to CI-CD Mini Project_version_2.0</h1>
            <div class="description">
                <p>This mini project demonstrates the power of <span class="highlight">CI/CD (Continuous Integration and Continuous Deployment)</span> in modern software development.</p>
                <p>CI/CD automates the process of integrating code changes, running tests, and deploying applications. This ensures faster delivery, reduced bugs, and streamlined development workflows.</p>
                <p>With every code push, the pipeline automatically:</p>
                <ul style="text-align: left; margin-top: 10px;">
                    <li>✔️ Builds the application</li>
                    <li>✔️ Runs automated tests</li>
                    <li>✔️ Deploys to the staging or production environment</li>
                </ul>
                <p>This project serves as a hands-on example of implementing a basic CI/CD workflow.</p>
            </div>
        </body>
        </html>
        """;

        return ResponseEntity.ok().header("Content-Type", "text/html").body(html);
    }
}
