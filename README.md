Práctica de la asignatura de Entornos de desarrollo sobre Integración Continua

Este proyecto consta de dos ramas: master y develop, todo el código se encuentra en la rama develop.

Cada nueva funcionalidad se ha añadido mediante pull request de una feature con develop, la integración continua se realiza mediante jenkins que compila el proyecto y lanza los test de JUnit y la calidad del código con SonarQube que está integrado en la configuración del job de jenkins.
