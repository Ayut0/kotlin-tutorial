# kotlin-tutorial

## Basic Syntax
- Class
- Interface
- Data Class
- Enum
- Collections
- Unit test
- Exception
- if
- when

## Test Driven Development (TDD)
A technique for Software Development that start building it by writing tests.

Here is the brief step
1. Write down test cases
2. Pick one of them
3. Write test
4. Create functions for test to pass that test 
5. Refactor them

This step is often summarized as Red-Green=Refactor, are the cornerstone of the process.
- Red : Write the test
- Green : Make function pass the test
- Refactor

More details https://martinfowler.com/bliki/TestDrivenDevelopment.html

### How to demonstrate TDD with IntelliJ IDEA

#### Create a test

Make sure to create a new package before getting into this step.
Right-click the `main/kotlin` directory in the Project and select `New | Package`.
Name it whatever you like.

1. Right-click the test root folder and select `New > Kotlin Class/File`.
   In the popup, name the package and test class.
2. Go to that test file and press `Command + N (Or Control + N depends on your setting)` to create a test function. 
   Select `Test Function` from the menu. Pick `JUnit5` as the test framework.
   Name it same as you do for `main | kotlin` to make function and test route consistent and press Enter.
3. Start writing test body. Add any classes you want to have then press `Option + Enter`, and select `Create class $class name`.
4. From the `Choose class container`, select `Extract to separate file`.
5. Keep writing test body such as adding functions.
6. Press `Option + Enter` on the function. Select `Create member function` to let IDE create a bare function.
7. Implement the function.

#### Run test

1. Inside the test, press `Control + Shift + R` to run a test.
   You can see its result in the run dialog.
2. If it passes the test, time to refactor.
   If not, make it pass the test.
3. Continue this process till it satisfies the requirement.