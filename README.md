## 1er Examen Bimestral
# Link Github
https://github.com/ElectroShark93/hernan.sanchez-epn.edu.ec.git
# Preguntas
1. Donde se produciria un Issue:
    * Defectos que tiene el codigo en general.
2. Donde se produciria un Bug: 
    * Problemas en el codigo o error de tipeo o de mal inicializacion de variables.
3. Donde se produciria un Error:
    * Al momento de correr el programa y no se ejecuta. 
# Código del ProgressBar
````TypeScript
public class App {
    public static void main(String[] args) throws Exception, InterruptedException {
        /**
         * @author : Hernán Sánchez
         * @version: 1
         */
        
        String nombre = "hernan.sanchez@epn.edu.ec";
        System.out.println("\n");
        for (int i = 0; i <= nombre.length(); i++) {
            System.out.println(" \t"+i);
            ProgressBar.showProgressBar_e(nombre,"\\/-o");
        }
        
    }
}
````

---------
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
