# Run Java programs with ojdbc11.jar in classpath
param([string]$Program)
java -cp "ojdbc11.jar;." $Program $args
