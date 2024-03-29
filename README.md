# Getting started

Simple calculator API hosted on APIMATIC

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

## How to Use

The following section explains how to use the APIMATICCalculator library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *APIMATICCalculatorLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

Clicking the ``` Add ``` button will open a dialog where you need to specify APIMATICCalculator in ``` Group Id ``` and APIMATICCalculatorLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=APIMATIC%20Calculator-Java&workspaceName=APIMATICCalculator&projectName=APIMATICCalculatorLib&rootNamespace=m39.m81.m213.m129)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *APIMATICCalculatorLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

APIMATICCalculatorClient client = new APIMATICCalculatorClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [CalculatorDevOpsConf](#calculator_dev_ops_conf)

## <a name="calculator_dev_ops_conf"></a>![Class: ](https://apidocs.io/img/class.png "m39.m81.m213.m129.controllers.CalculatorDevOpsConf") CalculatorDevOpsConf

### Get singleton instance

The singleton instance of the ``` CalculatorDevOpsConf ``` class can be accessed from the API Client.

```java
CalculatorDevOpsConf calculatorDevOpsConf = client.getCalculatorDevOpsConf();
```

### <a name="calculate_dev_ops_stamford_async"></a>![Method: ](https://apidocs.io/img/method.png "m39.m81.m213.m129.controllers.CalculatorDevOpsConf.calculateDevOpsStamfordAsync") calculateDevOpsStamfordAsync

> Calculates the expression using the specified operation..


```java
void calculateDevOpsStamfordAsync(
        final OperationType operation,
        final double x,
        final double y,
        final APICallBack<Double> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| operation |  ``` Required ```  | The operator to apply on the variables |
| x |  ``` Required ```  | The LHS value |
| y |  ``` Required ```  | The RHS value |


#### Example Usage

```java
OperationType operation = OperationType.fromString("MULTIPLY");
double x = 4;
double y = 5;
// Invoking the API call with sample inputs
calculatorDevOpsConf.calculateDevOpsStamfordAsync(operation, x, y, new APICallBack<Double>() {
    public void onSuccess(HttpContext context, Double response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



